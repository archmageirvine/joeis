package irvine.oeis.a048;

import irvine.math.z.Z;

/**
 * A048702 Binary palindromes of even length divided by 3.
 * @author Sean A. Irvine
 */
public class A048702 extends A048701 {

  @Override
  public Z next() {
    return super.next().divide(3);
  }
}
