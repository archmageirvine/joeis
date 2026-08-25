package irvine.oeis.a086;

import irvine.math.z.Z;

/**
 * A086352 Main diagonal of square array A086350.
 * @author Sean A. Irvine
 */
public class A086352 extends A086350 {

  private long mN = -1;

  @Override
  public Z next() {
    return t(++mN, mN);
  }
}
