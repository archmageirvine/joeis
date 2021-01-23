package irvine.oeis.a031;

import irvine.math.z.Z;

/**
 * A031184 Numbers having period-2 4-digitized sequences.
 * @author Sean A. Irvine
 */
public class A031184 extends A031182 {

  @Override
  public Z next() {
    while (!Z.TWO.equals(super.next())) {
      // do nothing
    }
    return Z.valueOf(mN);
  }
}
