package irvine.oeis.a075;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.oeis.a125.A125183;

/**
 * A075866 Number of permutations s of {1,2,...,n} such that |s(i)-i| for i=1,2,...,n are all distinct.
 * @author Sean A. Irvine
 */
public class A075866 extends Sequence0 {

  private final A125183 mSeq = new A125183();
  private int mN = -1;

  @Override
  public Z next() {
    final int r = ++mN & 3;
    if (r == 2 || r == 3) {
      return Z.ZERO;
    }
    return mSeq.t(mN, mN);
  }
}
