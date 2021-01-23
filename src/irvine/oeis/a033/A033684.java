package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A033684 1 iff n is a square not divisible by 3.
 * @author Sean A. Irvine
 */
public class A033684 implements Sequence {

  private long mN = -1;
  private long mM = 1;
  private long mS = 1;
  
  @Override
  public Z next() {
    if (++mN == mS) {
      if (++mM % 3 == 0) {
        ++mM;
      }
      mS = mM * mM;
      return Z.ONE;
    }
    return Z.ZERO;
  }
}
