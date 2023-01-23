package irvine.oeis.a061;

import irvine.math.z.Z;

/**
 * A061155.
 * @author Sean A. Irvine
 */
public class A061158 extends A061157 {

  @Override
  public Z next() {
    super.next();
    return Z.valueOf(mP);
  }
}
