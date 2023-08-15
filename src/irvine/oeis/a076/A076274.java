package irvine.oeis.a076;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A076274 2p-1 where p is 1 or a prime.
 * @author Georg Fischer
 */
public class A076274 extends A000040 {

  private long mN = 0L;

  @Override
  public Z next() {
    return (++mN == 1L) ? Z.ONE : super.next().multiply(2).subtract(1);
  }
}
