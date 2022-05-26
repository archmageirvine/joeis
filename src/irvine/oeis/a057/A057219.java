package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000040;
import irvine.oeis.a000.A000227;

/**
 * A057219 {e^n}-th prime, where {e^n} is closest integer to e^n, A000227.
 * @author Sean A. Irvine
 */
public class A057219 extends A000040 {

  private final Sequence mA = new A000227();
  private long mM = 0;

  @Override
  public Z next() {
    final long lim = mA.next().longValueExact();
    Z p = null;
    while (mM < lim) {
      p = super.next();
      ++mM;
    }
    return p;
  }
}
