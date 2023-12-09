package irvine.oeis.a067;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067170 Numbers n such that sum of the cubes of the distinct prime factors of n equals the sum of the cubes of the digits of n.
 * @author Sean A. Irvine
 */
public class A067170 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      Z a = Z.ZERO;
      for (final Z p : Jaguar.factor(++mN).toZArray()) {
        a = a.add(p.pow(3));
      }
      long m = mN;
      while (m != 0) {
        final long r = m % 10;
        a = a.subtract(r * r * r);
        m /= 10;
      }
      if (a.isZero()) {
        return Z.valueOf(mN);
      }
    }
  }
}
