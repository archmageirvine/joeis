package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a025.A025179;

/**
 * A024997.
 * @author Sean A. Irvine
 */
public class A024997 extends A025179 {

  @Override
  public Z next() {
    return super.next().multiply2();
  }
}
