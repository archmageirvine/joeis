package irvine.oeis.a077;

import irvine.math.z.Z;

/**
 * A077406 In base <code>3: n</code> sets a new record for the number of Reverse and <code>Add!</code> steps needed to reach a palindrome starting with <code>n</code>.
 * @author Sean A. Irvine
 */
public class A077406 extends A077407 {

  @Override
  public Z next() {
    super.next();
    return Z.valueOf(mN);
  }
}


