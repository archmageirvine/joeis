package irvine.oeis.a083;

import irvine.math.z.Z;

/**
 * A083805 n-th partial concatenation of terms of A083804 divided by n.
 * @author Sean A. Irvine
 */
public class A083805 extends A083804 {

  @Override
  public Z next() {
    super.next();
    return mA.divide(mN);
  }
}
