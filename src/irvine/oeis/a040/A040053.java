package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.a000.A000594;

/**
 * A040053 a(n) is 1 if and only if Ramanujan's tau(n) &gt; 0.
 * @author Sean A. Irvine
 */
public class A040053 extends A000594 {

  @Override
  public Z next() {
    return super.next().signum() > 0 ? Z.ONE : Z.ZERO;
  }
}
