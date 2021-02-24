package irvine.oeis.a039;

import irvine.math.z.Z;
import irvine.oeis.a050.A050829;

/**
 * A039730 A050829 divided by 2.
 * @author Sean A. Irvine
 */
public class A039730 extends A050829 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}
