package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.oeis.a039.A039960;

/**
 * A060151.
 * @author Sean A. Irvine
 */
public class A060151 extends A039960 {

  {
    setOffset(1);
    super.next();
  }

  @Override
  public Z next() {
    return super.next().add(mN == 1 ? 0 : 1);
  }
}
