package irvine.oeis.a020;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000045;

/**
 * A020345.
 * @author Sean A. Irvine
 */
public class A020345 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    final String prefix = String.valueOf(++mN);
    final Sequence fibo = new A000045();
    Z f;
    while (!(f = fibo.next()).toString().startsWith(prefix)) {
      // do nothing
    }
    return f;
  }
}
