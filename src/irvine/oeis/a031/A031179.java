package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031179 Numbers having <code>period-1 3-digitized</code> sequences.
 * @author Sean A. Irvine
 */
public class A031179 extends A031178 {

  @Override
  public Z next() {
    while (!Z.ONE.equals(super.next())) {
      // do nothing
    }
    return Z.valueOf(mN);
  }
}
