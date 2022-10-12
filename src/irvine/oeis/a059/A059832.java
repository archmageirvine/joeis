package irvine.oeis.a059;

import java.util.Arrays;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A059832 A ternary tribonacci triangle: form the triangle as follows: start with 3 single values: 1, 2, 3. Each succeeding row is a concatenation of the previous 3 rows.
 * @author Sean A. Irvine
 */
public class A059832 implements Sequence {

  private long[] mA = null;
  private long[] mB = null;
  private long[] mC = {1};
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN >= mC.length) {
      mN = 0;
      if (mB == null) {
        mB = mC;
        mC = new long[] {2};
      } else if (mA == null) {
        mA = mB;
        mB = mC;
        mC = new long[] {3};
      } else {
        final long[] t = Arrays.copyOf(mA, mA.length + mB.length + mC.length);
        System.arraycopy(mB, 0, t, mA.length, mB.length);
        System.arraycopy(mC, 0, t, mA.length + mB.length, mC.length);
        mA = mB;
        mB = mC;
        mC = t;
      }
    }
    return Z.valueOf(mC[mN]);
  }
}
