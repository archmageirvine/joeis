package irvine.oeis.a019;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Euler;
import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A019537 Number of special orbits for dihedral group of degree n.
 * @author Sean A. Irvine
 */
public class A019537 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final Z[] divisors = Jaguar.factor(++mN).divisors();
    final long[] divs = new long[divisors.length];
    for (int k = 0; k < divisors.length; ++k) {
      divs[k] = divisors[k].longValue();
    }
    Z sum = Z.ZERO;
    Z kf = Z.ONE;
    for (long k = 1; k <= mN; ++k, kf = kf.multiply(k)) {
      Z s = Z.ZERO;
      for (final long d : divs) {
        s = s.add(Stirling.secondKind(mN / d, k).multiply(Euler.phiAsLong(d)));
      }
      s = s.multiply2().add(Stirling.secondKind((mN + 1) / 2, k).add(Stirling.secondKind((mN + 2) / 2, k)).multiply(mN));
      sum = sum.add(s.multiply(kf));
    }
    return sum.divide(mN).shiftRight(2);
  }
}

