package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.a000.A000010;

/**
 * A002618 <code>a(n) =</code> n*phi(n).
 * @author Sean A. Irvine
 */
public class A002618 extends A000010 {

  private long mN = 0;

  @Override
  public Z next() {
    return super.next().multiply(++mN);
  }
}
