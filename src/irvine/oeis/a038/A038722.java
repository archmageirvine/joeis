package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A038722 Take the sequence of natural numbers (A000027) and reverse successive subsequences of lengths 1,2,3,4,... .
 * @author Sean A. Irvine
 */
public class A038722 implements Sequence {

  private long mN = 0;
  private long mSwapPoint = 0;
  private long mS = 0;
  private long mM = 0;

  @Override
  public Z next() {
    if (--mM < mSwapPoint) {
      mSwapPoint = mS + 1;
      mS += ++mN;
      mM = mS;
    }
    return Z.valueOf(mM);
  }
}
