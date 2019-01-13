package irvine.oeis.a005;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005988.
 * @author Sean A. Irvine
 */
public class A005988 implements Sequence {

  private long mD = 1;

  private boolean hasRes1Mod9(final FactorSequence fs) {
    for (final Z d : fs.divisors()) {
      if (d.compareTo(Z.ONE) > 0 && d.mod(9) == 1) {
        return true;
      }
    }
    return false;
  }

  private Z solve(final long bigD, final FactorSequence fs) {
    // Handle some special small cases
    if (bigD <= 20) {
      switch ((int) bigD) {
        case 2:
          return Z.NEG_ONE;
        case 9:
          return Z.valueOf(-2);
        case 17:
          return Z.valueOf(18);
        case 20:
          return Z.valueOf(-19);
        default: // do nothing
      }
    }
    long a = 1;
    long b = 1;
    long c = 1;
    long d = 1;
    long threes = 1;
    for (final Z p : fs.toZArray()) {
      final long pp = p.longValueExact();
      final int e = fs.getExponent(p) % 3;
      switch ((int) (pp % 3)) {
        case 0:
          assert pp == 3;
          threes = p.pow(e).longValueExact();
          break;
        case 1:
          b *= p.pow(e).longValueExact();
          break;
        default: // 2
          a *= p.pow(e).longValueExact();
          break;
      }
      switch (e) {
        case 1:
          c *= pp;
          break;
        case 2:
          d *= pp;
          break;
        default:
          break;
      }
    }
    assert bigD == c * d * d;
    assert bigD == threes * a * b : bigD + " != " + threes + " * " + a + " * " + b;
    if (b == 1) {
      return null; // Cohn, D != 2,9,17,20, b==1 inadmissable
    }
    final long r9 = bigD % 9;
    if (r9 == 3 || r9 == 4 || r9 == 5 || r9 == 6) {
      if (!hasRes1Mod9(fs)) {
        return null; // b has no factor of the form 1 + 9t
      }
    }

    // Williams and Holte give some complicated way of getting an exact answer in the remaining
    // cases, here we just use a search which is known to work up to 50000 and for which I know
    // of no counter example

    // Heuristic search
    for (long x = 1; x < 2 * bigD; ++x) {
      final long x3 = x * x * x;
      final long v = 1 - x3;
      if (v != 0 && v % bigD == 0) {
        final Z g = Z.valueOf(v / bigD);
        g.root(3);
        if (g.auxiliary() == 1) {
          return Z.valueOf(x);
        }
      }
      final long w = 1 + x3;
      if (w % bigD == 0) {
        final Z g = Z.valueOf(w / bigD);
        g.root(3);
        if (g.auxiliary() == 1) {
          return Z.valueOf(-x);
        }
      }
    }
    // Strictly I only know the heuristic works to 50000
//    if (bigD < 50000) {
//      return null;
//    }
//    throw new UnsupportedOperationException("Could not solve for: " + bigD);
    return null;
  }

  protected Z getReturnValue(final long d, final Z x, final long y3) {
    return Z.valueOf(d);
  }

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Cheetah.factor(++mD);
      final FactorSequence effectiveFs = new FactorSequence();
      Z r = Z.ONE;
      for (final Z p : fs.toZArray()) {
        final int e = fs.getExponent(p);
        r = r.multiply(p.pow(e / 3));
        effectiveFs.add(p, fs.getStatus(p), e % 3);
      }
      final long d3 = r.pow(3).longValueExact();
      final long effectiveD = mD / d3;
      final Z x = solve(effectiveD, effectiveFs);
      if (x != null) {
        final long y3 = (1 - x.pow(3).longValueExact()) / effectiveD;
        if (y3 % d3 == 0) {
          return getReturnValue(mD, x, y3 / d3);
        }
      }
    }
  }

}
