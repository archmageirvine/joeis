package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031197 Numbers having <code>period-4 6-digitized</code> sequences.
 * @author Sean A. Irvine
 */
public class A031197 extends A031195 {

  @Override
  public Z next() {
    while (!Z.FOUR.equals(super.next())) {
      // do nothing
    }
    return Z.valueOf(mN);
  }
}
