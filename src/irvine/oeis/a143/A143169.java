package irvine.oeis.a143;

import irvine.math.z.Z;
import irvine.oeis.a049.A049029;

/**
 * A143169 Fourth column of triangle A000369: |S2(-3;n+4,4)|..
 * @author Georg Fischer
 */
public class A143169 extends A049029 {

  private long mN = -1;

  /** Construct the sequence. */
  public A143169() {
    setOffset(0);
  }

  @Override
  public Z next() {
    ++mN;
    return super.compute(mN + 3L, 3L);
  }
}
