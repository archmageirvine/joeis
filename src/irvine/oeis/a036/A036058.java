package irvine.oeis.a036;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A036058 Summarize digits of preceding number, by decreasing digit value. Start with a(0) = 0.
 * @author Sean A. Irvine
 */
public class A036058 extends Sequence0 {

  private static final Z FIXED = Z.valueOf(1433223110);
  private static final long[] VALUES = {0, 10, 1110, 3110, 132110, 13123110, 23124110, 1413223110, 1423224110, 2413323110L};
  private int mN = -1;

  @Override
  public Z next() {
    return mN < VALUES.length - 1 ? Z.valueOf(VALUES[++mN]) : FIXED;
  }
}
