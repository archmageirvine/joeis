package irvine.oeis.a161;
// manually 2021-06-23

import irvine.math.z.Z;
import irvine.oeis.a160.A160700;

/**
 * A161440 Numbers m such that A160700(m) = 0.
 * @author Georg Fischer
 */
public class A161440 extends A160700 {
    
  private Z mParm;
  protected int mK;
  
  /** Construct the sequence. */
  public A161440() {
    this(0);
  }
  
  /** 
   * Generic constructor with parameter
   * @param parm target value of A160700
   */
  public A161440(final int parm) {
    mParm = Z.valueOf(parm);
    mK = -1;
    setOffset(1);
  }
  
  @Override
  public Z next() {
    ++mK;
    Z value = super.next();
    while (!value.equals(mParm)) {
      ++mK;
      value = super.next();
    }
    return Z.valueOf(mK);
  }
}
