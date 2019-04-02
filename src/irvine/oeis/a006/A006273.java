package irvine.oeis.a006;

import irvine.math.z.Z;

/**
 * A006273 Numerators of a continued fraction for (3+sqrt(13))/2.
 * @author Sean A. Irvine
 */
public class A006273 extends A006268 {

  private boolean mFirst = true;

  @Override
  public Z next() {
    if (mFirst) {
      mFirst = false;
      return Z.THREE;
    }
    return super.next().square().add(1);
  }
}
