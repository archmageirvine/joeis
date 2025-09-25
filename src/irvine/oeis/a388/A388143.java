package irvine.oeis.a388;

import irvine.math.z.Z;
import irvine.oeis.a384.A384724;

/**
 * A388143 allocated for Janaka Rodrigo.
 * @author Sean A. Irvine
 */
public class A388143 extends A384724 {

  private int mN = 0;
  private int mM = -1;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return t(mM + 3, mN + 2 - mM);
  }
}

