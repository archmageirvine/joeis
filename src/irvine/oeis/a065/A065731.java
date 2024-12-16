package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.a000.A000142;

/**
 * A065731 Largest square &lt;= n!.
 * @author Sean A. Irvine
 */
public class A065731 extends A000142 {

  @Override
  public Z next() {
    return super.next().sqrt().square();
  }
}
