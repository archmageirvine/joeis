package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A001202 <code>a(1)=0, a(2n) = a(n)+1, a(2n+1) = 10*a(n+1)</code>.
 * @author Sean A. Irvine
 */
public class A001202 extends MemorySequence {

  private int mN = -1;

  @Override
  protected Z computeNext() {
    if (++mN == 0) {
      return Z.ZERO;
    }
    return (mN & 1) == 0 ? get(mN / 2).multiply(10) : get(mN / 2).add(1);
  }
}

