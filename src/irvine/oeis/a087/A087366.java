package irvine.oeis.a087;

import irvine.math.z.Z;

/**
 * A087366 Smallest k such that k*n^n is a palindrome, or 0 if none exists.
 * @author Sean A. Irvine
 */
public class A087366 extends A087365 {

  private long mN = 0;

  @Override
  public Z next() {
    return super.next().divide(Z.valueOf(++mN).pow(mN));
  }
}
