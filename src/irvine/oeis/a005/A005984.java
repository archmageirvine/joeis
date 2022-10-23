package irvine.oeis.a005;

import java.util.ArrayList;

import irvine.math.group.GaloisField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicArray;

/**
 * A005984 Related to recurrences over rings.
 * @author Sean A. Irvine
 */
public class A005984 extends Sequence1 {

  // After Michel Marcus

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(new GaloisField(2));

  private Polynomial<Z> q(final long m) {
    final ArrayList<Z> vj = new ArrayList<>();
    vj.add(Z.ONE);
    for (long j = 1, t = m; t != 0; ++j, t >>>= 1) {
      vj.add(Integers.SINGLETON.coerce(t & 1));
    }
    return RING.create(vj);
  }

  void g(final long n, final LongDynamicArray<Polynomial<Z>> vg) {
    if (n >= vg.length() || vg.get(n) == null) {
      final long vs = Long.bitCount(n);
      if (vs == 1) {
        vg.set(n, q(n));
      } else {
        Polynomial<Z> vp = RING.one();
        for (long j = 0, t = n; t != 0; ++j, t >>>= 1) {
          if ((t & 1) != 0) {
            final long vi = n - (1L << j);
            g(vi, vg);
            final Polynomial<Z> gcd = RING.gcd(vp, vg.get(vi));
            vp = RING.multiply(vp, RING.divideAndRemainder(vg.get(vi), gcd)[0]);
          }
        }
        vg.set(n, RING.multiply(vp, q(n)));
      }
    }
  }

  private int mR = 0;

  @Override
  public Z next() {
    ++mR;
    final long n = (1L << mR) - 1;
    final LongDynamicArray<Polynomial<Z>> vg = new LongDynamicArray<>();
    g(n, vg);
    final Polynomial<Z> g = vg.get(n);
    final Polynomial<Z> phi = Polynomial.create(1L, 1L);
    Polynomial<Z> dphi = phi;
    long np = 0;
    while (true) {
      if (!RING.zero().equals(RING.mod(g, dphi))) {
        break;
      }
      dphi = RING.multiply(dphi, phi);
      ++np;
    }
    return Z.valueOf(np);
  }
}
