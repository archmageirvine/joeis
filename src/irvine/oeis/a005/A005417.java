package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.a080.A080742;

/**
 * A005417.
 * @author Sean A. Irvine
 */
public class A005417 extends A080742 {

  private Z mMax = Z.TWO;

  @Override
  public Z next() {
    mMax = mMax.max(super.next());
    return mMax;
  }
}
