package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.a000.A000111;

/**
 * A006212 Number of down-up permutations of n+3 starting with n+1.
 * @author Sean A. Irvine
 */
public class A006212 extends A000111 {

  private Z mA = super.next();
  private Z mB = super.next();

  @Override
  public Z next() {
    final Z t = mA;
    mA = mB;
    mB = super.next();
    return mB.subtract(t);
  }
}
