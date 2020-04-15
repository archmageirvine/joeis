package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031209 Numbers having <code>period-56 7-digitized</code> sequences.
 * @author Sean A. Irvine
 */
public class A031209 extends A031200 {

  private static final Z Z56 = Z.valueOf(56);

  @Override
  public Z next() {
    while (!Z56.equals(super.next())) {
      // do nothing
    }
    return Z.valueOf(mN);
  }
}
