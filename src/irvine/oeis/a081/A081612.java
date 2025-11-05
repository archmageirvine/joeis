package irvine.oeis.a081;

import irvine.math.z.Z;
import irvine.oeis.a082.A082827;

/**
 * A081612 First column of A082827.
 * @author Sean A. Irvine
 */
public class A081612 extends A082827 {

  @Override
  public Z next() {
    step();
    return mRow[0];
  }
}
