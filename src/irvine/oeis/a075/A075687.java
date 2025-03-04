package irvine.oeis.a075;

import irvine.math.z.Z;

/**
 * A075687 In base 4, records for the number of Reverse and Add! steps needed to reach a palindrome.
 * @author Sean A. Irvine
 */
public class A075687 extends A075686 {

  @Override
  public Z next() {
    super.next();
    return Z.valueOf(mBest);
  }
}
