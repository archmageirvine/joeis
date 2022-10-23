package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A033683 a(n) = 1 if n is an odd square not divisible by 3, otherwise 0.
 * @author Sean A. Irvine
 */
public class A033683 extends Sequence0 {

  private long mN = -1;
  private long mM = 1;
  private long mS = 1;
  
  @Override
  public Z next() {
    if (++mN == mS) {
      mM += 2;
      if (mM % 3 == 0) {
        mM += 2;
      }
      mS = mM * mM;
      return Z.ONE;
    }
    return Z.ZERO;
  }
}
