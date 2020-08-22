package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031188 Numbers having period-2 5-digitized sequences.
 * @author Sean A. Irvine
 */
public class A031188 extends A031186 {

  @Override
  public Z next() {
    while (!Z.TWO.equals(super.next())) {
      // do nothing
    }
    return Z.valueOf(mN);
  }
}
