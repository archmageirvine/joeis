package irvine.oeis.a059;

import java.util.Arrays;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A059689 List consisting of all functions from [1,2,3,...,n] into [1,2,3,...,n] for n=1,2,3,... (written out in full) in lexicographic order.
 * @author Sean A. Irvine
 */
public class A059689 implements Sequence {

  private int mN = 0;
  private int mM = 0;
  private int[] mV = new int[0];

  private boolean bump(final int[] v) {
    for (int k = v.length - 1; k >= 0; --k) {
      if (++v[k] <= mN) {
        return true;
      }
      v[k] = 1;
    }
    return false;
  }

  @Override
  public Z next() {
    if (++mM >= mV.length) {
      mM = 0;
      if (!bump(mV)) {
        mV = new int[++mN];
        Arrays.fill(mV, 1);
      }
    }
    return Z.valueOf(mV[mM]);
  }
}
