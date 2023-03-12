package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.oeis.a048.A048760;

/**
 * A061859.
 * @author Sean A. Irvine
 */
public class A061887 extends A048760 {

  @Override
  public Z next() {
    return super.next().add(mN);
  }
}
