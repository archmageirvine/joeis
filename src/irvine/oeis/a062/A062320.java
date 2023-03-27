package irvine.oeis.a062;

import irvine.math.z.Z;
import irvine.oeis.a013.A013929;

/**
 * A062320 Nonsquarefree numbers squared. A013929(n)^2.
 * @author Sean A. Irvine
 */
public class A062320 extends A013929 {

  @Override
  public Z next() {
    return super.next().square();
  }
}
