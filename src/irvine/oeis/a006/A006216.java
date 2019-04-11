package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.a000.A000111;

/**
 * A006216 Number of down-up permutations of <code>n+4</code> starting with 4.
 * @author Sean A. Irvine
 */
public class A006216 extends A000111 {

  private Z mA = super.next();
  private Z mB = super.next();

  @Override
  public Z next() {
    final Z t = mA;
    mA = mB;
    mB = super.next();
    return mB.multiply(3).subtract(t);
  }
}
