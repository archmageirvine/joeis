package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A033683 a(n) = 1 if n is an odd square not divisible by 3, else it's 0.
 * @author Sean A. Irvine
 */
public class A033683 implements Sequence {

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
