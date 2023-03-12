package irvine.oeis.a061;

import irvine.math.z.Z;

/**
 * A061859.
 * @author Sean A. Irvine
 */
public class A061888 extends A061890 {

  @Override
  public Z next() {
    return super.next().sqrt();
  }
}
