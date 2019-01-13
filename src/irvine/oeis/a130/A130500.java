package irvine.oeis.a130;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

import java.util.Arrays;

/**
 * A130500.
 * @author Sean A. Irvine
 */
public class A130500 implements Sequence {

  private int mN = 0;
  private int[] mA = new int[1024];

  private void set(final int v) {
    if (v >= mA.length) {
      mA = Arrays.copyOf(mA, mA.length * 2);
    }
    mA[v]++;
  }

  @Override
  public Z next() {
    if (++mN == 1) {
      set(mN);
      return Z.ONE;
    }
    int z = 0;
    for (int k = 1; k <= mN; ++k) {
      if (k >= mA.length || mA[k] == 0) {
        ++z;
      }
    }
    int r = 0;
    for (int k = 1; k < mA.length; ++k) {
      if (z % k == 0) {
        r += mA[k];
      }
    }
    set(r);
    return Z.valueOf(r);
  }
}

