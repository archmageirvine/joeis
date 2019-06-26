package irvine.oeis.a024;

import irvine.math.z.Stirling;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A024173 Integer part of <code>((4th</code> elementary symmetric function of 1,2,..,n)/(2nd elementary symmetric function of <code>1,2,...,n))</code>.
 * @author Sean A. Irvine
 */
public class A024173 implements Sequence {

  private long mN = 1;

  @Override
  public Z next() {
    if (++mN == 2) {
      return Z.ZERO;
    }
    return Stirling.firstKind(mN + 1, mN - 3).divide(Stirling.firstKind(mN + 1, mN - 1));
  }
}
