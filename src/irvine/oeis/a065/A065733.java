package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.a000.A000578;

/**
 * A065733 Largest square &lt;= n^3.
 * @author Sean A. Irvine
 */
public class A065733 extends A000578 {

  @Override
  public Z next() {
    return super.next().sqrt().square();
  }
}
