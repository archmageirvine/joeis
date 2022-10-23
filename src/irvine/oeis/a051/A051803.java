package irvine.oeis.a051;
// manually 2021-09-29

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A051803 Numbers with nonzero multiplicative digital root 1. 
 * @author Georg Fischer
 */
public class A051803 extends Sequence1 {

  protected Z mN;
  protected Z mParm;

  /** Construct the sequence. */
  public A051803() {
    this(1);
  }

  /**
   * Generic constructor with parameter
   * @param parm parameter
   */
  public A051803(final int parm) {
    mN = Z.NEG_ONE;
    mParm = Z.valueOf(parm);
  }

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (ZUtils.digitNZProductRoot(mN).equals(mParm)) {
        return mN;
      }
    }
  }
}
