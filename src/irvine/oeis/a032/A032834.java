package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A032834 Numbers with digits 3 and 4 only.
 * @author Sean A. Irvine
 */
public class A032834 extends MemorySequence {

  protected int mParm1; 
  protected int mParm2;

  /** Construct the sequence */
  public A032834() {
    this(3, 4);
  }
  
  /**
   * Generic constructor with parameters
   * @param parm1 first base
   * @param parm2 second base
   */
  public A032834(final int parm1, final int parm2) {
    mParm1 = parm1;
    mParm2 = parm2;
    add(Z.ZERO);
  }


  @Override
  protected Z computeNext() {
    final int n = size();
    return (n & 1) == 0
      ? get(n / 2 - 1).multiply(10).add(mParm2)
      : get((n - 1) / 2).multiply(10).add(mParm1);
  }
}
