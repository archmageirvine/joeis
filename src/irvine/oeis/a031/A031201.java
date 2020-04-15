package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031201 Numbers having <code>period-1 7-digitized</code> sequences.
 * @author Sean A. Irvine
 */
public class A031201 extends A031200 {

  @Override
  public Z next() {
    while (!Z.ONE.equals(super.next())) {
      // do nothing
    }
    return Z.valueOf(mN);
  }
}
