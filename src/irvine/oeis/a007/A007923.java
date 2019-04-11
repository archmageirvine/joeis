package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007923 Lengths increase by <code>1,</code> digits cycle through positive digits.
 * @author Sean A. Irvine
 */
public class A007923 implements Sequence {

  private int mM = -1;
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    final StringBuilder sb = new StringBuilder();
    for (int k = 0; k < mN; ++k) {
      mM = (mM + 1) % 9;
      sb.append(mM + 1);
    }
    return new Z(sb);
  }
}
