package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031198 Numbers having <code>period-10 6-digitized</code> sequences.
 * @author Sean A. Irvine
 */
public class A031198 extends A031195 {

  @Override
  public Z next() {
    while (!Z.TEN.equals(super.next())) {
      // do nothing
    }
    return Z.valueOf(mN);
  }
}
