package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007576.
 * @author Sean A. Irvine
 */
public class A007576 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    final int s = mN * (mN + 1) / 2;
    return A007575.getPoly(mN, s).coeff(s);
  }

}
