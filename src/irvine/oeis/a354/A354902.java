package irvine.oeis.a354;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A354902 a(n) = 2*n^2 - 6*n + 11 for n &gt; 1 with a(0)=1 and a(1)=3.
 * @author Georg Fischer
 */
public class A354902 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    if (mN == 0) {
      return Z.ONE;
    }
    if (mN == 1) {
      return Z.THREE;
    }
    return Z.valueOf(mN - 3).multiply(2L * mN).add(11);
  }
}
