package irvine.oeis.a095;
// manually 2021-05-14 

import irvine.math.z.Z;

/**
 * A095437 a(n) = 21 written in base 10 - n.
 * @author Georg Fischer
 */
public class A095437 extends A095425 {

  protected int mParm2;
  
  /** Construct the sequence. */
  public A095437() {
    this(21, 10);
  }

  /**
   * Generic constructor with parameters
   * @param parm number to be written in base parm2 - n
   * @param parm2 negative shift for n
   */
  public A095437(final int parm, final int parm2) {
    super.mParm = parm;
    mParm2 = parm2;
    super.mN = -1;
  }
  
  @Override
  public Z next() {
    ++mN;
    return mParm2 - mN >= 1 ? toString10(mParm, mParm2 - mN) : null; // stop if base = 0
  }

}
