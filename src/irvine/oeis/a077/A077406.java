package irvine.oeis.a077;

import irvine.math.z.Z;

/**
 * A077406 In base 3: n sets a new record for the number of Reverse and Add! steps needed to reach a palindrome starting with n.
 * @author Sean A. Irvine
 */
public class A077406 extends A077407 {

  @Override
  public Z next() {
    super.next();
    return Z.valueOf(mN);
  }
}


