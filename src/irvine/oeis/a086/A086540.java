package irvine.oeis.a086;

import irvine.math.z.Z;
import irvine.oeis.a074.A074997;

/**
 * A086540 Numbers n such that n and n+1 both are members of A074997; i.e., on the one hand n-1 and n+1 have the same prime signature, on the other hand n and n+2 have the same prime signature.
 * @author Sean A. Irvine
 */
public class A086540 extends A074997 {

  private Z mA = super.next();

  @Override
  public Z next() {
    while (true) {
      final Z t = mA;
      mA = super.next();
      if (mA.subtract(t).isOne()) {
        return t;
      }
    }
  }
}
