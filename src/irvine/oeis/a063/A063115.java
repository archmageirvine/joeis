package irvine.oeis.a063;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;
import irvine.util.array.DynamicIntArray;

/**
 * A063115 Smallest k such that 2^k has exactly n 1's in its decimal representation.
 * Cf. A063555.java
 * @author Georg Fischer
 */
public class A063115 implements Sequence {

  protected final DynamicIntArray mSmallest = new DynamicIntArray();
  protected int mN = -1;
  protected Z mA = Z.ONE;
  protected int mM = 1; // actually one larger than power of 2, as 0 is "unknown" in array
  protected int mParm1; 
  protected int mParm2;

  /** Construct the sequence */
  public A063115() {
    this(2, 1);
  }
  
  /**
   * Generic constructor with parameters
   * @param parm1 base
   * @param parm2 desired digits
   */
  public A063115(final int parm1, final int parm2) {
    mParm1 = parm1;
    mParm2 = parm2;
  }

  @Override
  public Z next() {
    ++mN;
    while (mSmallest.get(mN) == 0) {
      ++mM;
      mA = mA.multiply(mParm1);
      final int count = ZUtils.digitCounts(mA, 10)[mParm2];
      if (mSmallest.get(count) == 0) {
        mSmallest.set(count, mM);
      }
    }
    return Z.valueOf(mSmallest.get(mN) - 1);
  }
}

