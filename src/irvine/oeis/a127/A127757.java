package irvine.oeis.a127;
// manually 2021-09-29

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A127757 Integer part of Gauss' Arithmetic-Geometric Mean M(1,n).
 * @author Georg Fischer
 */
public class A127757 implements Sequence {

  protected int mN;
  protected CR mParm1;
  protected int mParm2;

  /** Construct the sequence. */
  public A127757() {
    this(1, 1, 1);
  }

  /**
   * Generic constructor with parameter
   * @param offset index of first term
   * @param parm1 first parameter of AGM
   * @param parm2 power of n
   */
  public A127757(final int offset, final int parm1, final int parm2) {
    mN = offset - 1;
    mParm1 = CR.valueOf(parm1);
    mParm2 = parm2;
  }

  @Override
  public Z next() {
    ++mN;
    return mParm1.agm(CR.valueOf(mN).pow(mParm2)).floor();
  }
}
