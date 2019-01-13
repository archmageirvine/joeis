package irvine.oeis.a011;

import irvine.math.z.Z;
import irvine.oeis.a007.A007695;

/**
 * A011833.
 * @author Sean A. Irvine
 */
public class A011833 extends A007695 {

  private long mN = -1;

  @Override
  public Z next() {
    return f(++mN, 9);
  }
}
