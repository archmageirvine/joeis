package irvine.oeis.a079;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A079416 a(n) = round(prime(n)/n).
 * @author Sean A. Irvine
 */
public class A079416 extends A000040 {

  private long mN = 0;

  @Override
  public Z next() {
    return new Q(super.next(), ++mN).round();
  }
}

