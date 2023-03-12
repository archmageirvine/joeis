package irvine.oeis.a061;

import irvine.math.z.Z;

/**
 * A061859.
 * @author Sean A. Irvine
 */
public class A061868 extends A061869 {

  @Override
  public Z next() {
    return super.next().sqrt();
  }
}
