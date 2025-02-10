package irvine.oeis.a075;

import irvine.math.z.Z;

/**
 * A075100 Number of words of length strictly between 1 and n that are needed on the way to computing all words of length n in the free monoid with two generators.
 * @author Sean A. Irvine
 */
public class A075100 extends A075099  {

  private int mN = 0;

  @Override
  public Z next() {
    return super.next().subtract(1L << ++mN).max(Z.ZERO);
  }
}
