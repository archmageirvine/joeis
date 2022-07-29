package irvine.oeis.a058;

import irvine.math.z.Z;

/**
 * A058189 Number of increasing geometric progressions ending in n (in the positive integers), including those of length 1 or 2.
 * @author Sean A. Irvine
 */
public class A058189 extends A058190 {

  @Override
  public Z next() {
    return super.next().add(mN);
  }
}
