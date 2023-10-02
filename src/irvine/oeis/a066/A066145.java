package irvine.oeis.a066;

import irvine.math.z.Z;

/**
 * A066145 In base 2, records for the number of 'Reverse and Add' steps needed to reach a palindrome.
 * @author Sean A. Irvine
 */
public class A066145 extends A066144 {

  @Override
  public Z next() {
    super.next();
    return Z.valueOf(mBest);
  }
}
