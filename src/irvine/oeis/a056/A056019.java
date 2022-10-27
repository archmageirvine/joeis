package irvine.oeis.a056;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import irvine.math.z.Z;
import irvine.oeis.a055.A055089;

/**
 * A056019 Self-inverse infinite permutation which shows the position of each finite permutation's inverse permutation in A055089.
 * @author Sean A. Irvine
 */
public class A056019 extends A055089 {

  private List<int[]> mA = Collections.singletonList(new int[0]);
  private long mOffset = 0;
  {
    mReverseColex.clear();
    mReverseColex.add(new int[0]); // Handle identity
  }

  private int[] inverse(final int[] perm) {
    final int[] inv = new int[perm.length];
    for (int k = 0; k < perm.length; ++k) {
      inv[perm[k]] = k;
    }
    return inv;
  }

  @Override
  public Z next() {
    if (mReverseColex.isEmpty()) {
      mOffset += mA.size();
      step();
      mA = new ArrayList<>(mReverseColex);
    }
    final int[] perm = mReverseColex.pollFirst();
    final int[] inv = inverse(perm);
    long k = 0;
    for (final int[] lst : mA) {
      if (Arrays.equals(lst, inv)) {
        return Z.valueOf(mOffset + k);
      }
      ++k;
    }
    throw new RuntimeException();
  }
}
