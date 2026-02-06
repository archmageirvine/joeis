package irvine.oeis.a083;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.array.DynamicIntArray;

/**
 * A083653 Consider the binary Champernowne sequence (A030190): smallest number m such that in binary representation n is contained in the concatenation of m and its successors.
 * @author Sean A. Irvine
 */
public class A083653 extends Sequence0 {

  private static final int STEP = 100;
  private final StringBuilder mS = new StringBuilder();
  private final DynamicIntArray mPosToM = new DynamicIntArray();
  protected int mN = -1;
  private int mM = -1;

  @Override
  public Z next() {
    final String s = Long.toBinaryString(++mN);
    int pos;
    while ((pos = mS.indexOf(s)) < 0) {
      // Avoid extending the string too often but doing it in blocks
      for (int k = 0; k < STEP; ++k) {
        int t = mS.length();
        mS.append(Long.toBinaryString(++mM));
        for (int j = t; j < mS.length(); ++j) {
          mPosToM.set(j, mM);
        }
      }
    }
    return Z.valueOf(mPosToM.get(pos));
  }
}
