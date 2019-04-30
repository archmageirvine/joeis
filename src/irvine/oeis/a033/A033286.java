package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A033286 <code>a(n) = n * prime(n)</code>.
 * @author Sean A. Irvine
 */
public class A033286 extends A000040 {

  private long mN = 0;

  @Override
  public Z next() {
    return super.next().multiply(++mN);
  }
}

