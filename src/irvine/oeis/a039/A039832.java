package irvine.oeis.a039;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A039832 Numbers k such that k and k+1 both have 4 divisors.
 * @author Sean A. Irvine
 * @author Georg Fischer
 */
public class A039832 extends Sequence1 {

  protected Z mParm;
  protected boolean mPrev; // whether mN-1 had mParm divisors
  protected long mN;
  
  /** Construct the sequence. */
  public A039832() {
    this(4);
  }
  
  /** 
   * Generic constructor with parameter
   * @param parm parameter
   */
  public A039832(final int parm) {
    mN = 0;
    mParm = Z.valueOf(parm);
    mPrev = false;
  }
  
  @Override
  public Z next() {
    while (true) {
      final boolean isOk = mParm.equals(Functions.SIGMA0.z(++mN));
      if (mPrev && isOk) {
        mPrev = isOk;
        return Z.valueOf(mN - 1);
      } else {
        mPrev = isOk;
      }
    }
  }
}
