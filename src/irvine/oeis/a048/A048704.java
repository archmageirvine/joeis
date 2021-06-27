package irvine.oeis.a048;

import irvine.math.z.Z;

/**
 * A048704 Base 4 palindromes of even length divided by 5. a(n) = A048703(n)/5.
 * @author Sean A. Irvine
 */
public class A048704 extends A048703 {

  @Override
  public Z next() {
    return super.next().divide(5);
  }
}
