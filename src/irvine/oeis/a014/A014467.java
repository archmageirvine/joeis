package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.a008.A008292;

/**
 * A014467.
 * @author Sean A. Irvine
 */
public class A014467 extends A008292 {

  private long mN = 2;
  private long mM = 1;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = (mN + 3) / 2;
    }
    return get(mN, mM);
  }
}
