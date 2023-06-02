package irvine.oeis.a063;

import irvine.math.z.Z;
import irvine.oeis.a070.A070911;

/**
 * A063781.
 * @author Sean A. Irvine
 */
public class A063984 extends A070911 {

  @Override
  public Z next() {
    return super.next().subtract(mN).divide2().add(1);
  }
}
