package irvine.oeis.a036;

import irvine.math.z.Z;
import irvine.oeis.a001.A001865;

/**
 * A036360 Number of labeled connected functional digraphs.
 * @author Sean A. Irvine
 */
public class A036360 extends A001865 {

  @Override
  public Z next() {
    return super.next().multiply(mN * (long) mN);
  }
}
