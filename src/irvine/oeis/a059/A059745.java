package irvine.oeis.a059;

import irvine.math.z.Z;

/**
 * A059745 Palindromic squares of sporadic type.
 * @author Sean A. Irvine
 */
public class A059745 extends A059744 {

  @Override
  public Z next() {
    return super.next().square();
  }
}
