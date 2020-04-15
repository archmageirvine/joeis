package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031189 Numbers having <code>period-4 5-digitized</code> sequences.
 * @author Sean A. Irvine
 */
public class A031189 extends A031186 {

  @Override
  public Z next() {
    while (!Z.FOUR.equals(super.next())) {
      // do nothing
    }
    return Z.valueOf(mN);
  }
}
