package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a004.A004111;

/**
 * A000220 Number of asymmetric trees with n nodes (also called identity trees).
 * @author Sean A. Irvine
 */
public class A000220 extends Sequence1 {

  private final MemorySequence mA = new A004111();

  /** Construct the sequence. */
  public A000220() {
    mA.next();
  }

  @Override
  public Z next() {
    Z a = mA.next().multiply2();
    final int n = mA.size() - 1;
    if ((n & 1) == 0) {
      a = a.subtract(mA.a(n / 2));
    }
    for (int k = 0; k <= n; ++k) {
      a = a.subtract(mA.a(k).multiply(mA.a(n - k)));
    }
    return a.divide2();
  }
}

