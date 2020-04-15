package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031194 Numbers having <code>period-28 5-digitized</code> sequences.
 * @author Sean A. Irvine
 */
public class A031194 extends A031186 {

  private static final Z Z28 = Z.valueOf(28);

  @Override
  public Z next() {
    while (!Z28.equals(super.next())) {
      // do nothing
    }
    return Z.valueOf(mN);
  }
}
