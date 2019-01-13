package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.a008.A008292;

/**
 * A014468.
 * @author Sean A. Irvine
 */
public class A014468 extends A008292 {

  private long mN = 3;
  private long mM = 3;

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = (mN + 3) / 2;
    }
    return get(mN, mM);
  }
}
