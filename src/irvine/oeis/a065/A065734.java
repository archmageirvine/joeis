package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.a000.A000203;

/**
 * A065734 Largest square &lt;= sigma(n).
 * @author Sean A. Irvine
 */
public class A065734 extends A000203 {

  @Override
  public Z next() {
    return super.next().sqrt().square();
  }
}
