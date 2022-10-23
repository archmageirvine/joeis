package irvine.oeis.a015;
// manually 2021-09-29

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A015910 a(n) = 2^n mod n. 
 * @author Sean A. Irvine
 * @author Georg Fischer
 */
public class A015910 extends Sequence1 {

  protected Z mN;
  protected Z mParm;

  /** Construct the sequence. */
  public A015910() {
    this(2);
  }

  /**
   * Generic constructor with parameter
   * @param parm parameter
   */
  public A015910(final int parm) {
    mN = Z.ZERO;
    mParm = Z.valueOf(parm);
  }

  @Override
  public Z next() {
    mN = mN.add(1);
    return mParm.modPow(mN, mN);
  }
}
