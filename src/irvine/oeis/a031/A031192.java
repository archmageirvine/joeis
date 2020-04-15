package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031192 Numbers having <code>period-12 5-digitized</code> sequences.
 * @author Sean A. Irvine
 */
public class A031192 extends A031186 {

  private static final Z Z12 = Z.valueOf(12);

  @Override
  public Z next() {
    while (!Z12.equals(super.next())) {
      // do nothing
    }
    return Z.valueOf(mN);
  }
}
