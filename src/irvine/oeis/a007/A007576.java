package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007576 Number of solutions to k_1 + 2*k_2 <code>+ </code>... + n*k_n <code>= 0,</code> where k_i are from <code>{-1,0,1},</code> i=1..n.
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
