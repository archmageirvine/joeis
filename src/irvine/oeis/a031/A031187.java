package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031187 Numbers having <code>period-1 5-digitized</code> sequences.
 * @author Sean A. Irvine
 */
public class A031187 extends A031186 {

  @Override
  public Z next() {
    while (!Z.ONE.equals(super.next())) {
      // do nothing
    }
    return Z.valueOf(mN);
  }
}
