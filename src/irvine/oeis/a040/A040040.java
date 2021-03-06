package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.a014.A014574;

/**
 * A040040.
 * @author Sean A. Irvine
 */
public class A040040 extends A014574 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}
