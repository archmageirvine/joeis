package irvine.oeis.a145;

import irvine.math.z.Z;
import irvine.oeis.a049.A049029;

/**
 * A145562 Second column (m=2) of triangle A049029 (S2(5)).
 * @author Georg Fischer
 */
public class A145562 extends A049029 {

  private long mN = -1;

  /** Construct the sequence. */
  public A145562() {
    setOffset(0);
  }

  @Override
  public Z next() {
    ++mN;
    return super.compute(mN + 2L, 2L);
  }
}
