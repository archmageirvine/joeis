package irvine.oeis.a061;

import irvine.math.z.Z;

/**
 * A061155.
 * @author Sean A. Irvine
 */
public class A061156 extends A061155 {

  @Override
  public Z next() {
    super.next();
    return Z.valueOf(mP);
  }
}
