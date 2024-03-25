package irvine.oeis.a068;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068916 Smallest positive integer that is equal to the sum of the n-th powers of its prime factors (counted with multiplicity).
 * @author Sean A. Irvine
 */
public class A068916 extends Sequence1 {

  private long mN = 0;

  private boolean is(final long k) {
    final FactorSequence fs = Jaguar.factor(k);
    long s = 0;
    for (final Z p : fs.toZArray()) {
      final Z t = p.pow(mN).multiply(fs.getExponent(p));
      if (t.bitLength() >= Long.SIZE - 1) {
        return false;
      }
      final long u = t.longValueExact();
      if (u > k) {
        return false;
      }
      s += u;
      if (s > k) {
        return false;
      }
    }
    return s == k;
  }

  @Override
  public Z next() {
    ++mN;
    long k = 1;
    while (true) {
      if (is(++k)) {
        return Z.valueOf(k);
      }
    }
  }
}

