package irvine.oeis.a076;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A076079 Largest multiple of n &lt; the n-th prime.
 * @author Sean A. Irvine
 */
public class A076079 extends A000040 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    final Z p = super.next();
    return p.subtract(1).divide(mN).multiply(mN);
  }
}
