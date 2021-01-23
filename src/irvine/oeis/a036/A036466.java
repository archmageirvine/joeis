package irvine.oeis.a036;

import irvine.math.IntegerUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A036466 If n = Sum_{i} b(i)^2 (i.e., a partition of n into squares), then a(n) is the smallest possible value of the largest multiplicity of the b(i).
 * @author Sean A. Irvine
 */
public class A036466 implements Sequence {

  private int mN = 0;
  private int mUpperBound = 0;

  private int max(final int[] parts, final int maxPart) {
    int c = 1;
    int b = 0;
    for (int p = 1; p < maxPart; ++p) {
      if (parts[p] == parts[p - 1]) {
        ++c;
      } else {
        if (c > b) {
          b = c;
        }
        c = 1;
      }
    }
    if (c > b) {
      b = c;
    }
    return b;
  }

  private void search(final int remaining, final int[] parts, final int partIndex, final int m) {
    if (remaining == 0) {
      // We have constructed a sum mN^2 = sum(parts^2), with each part < mUpperBound occurrences
      final int max = max(parts, partIndex);
      if (max < mUpperBound) {
        //System.out.println(mN + " Upper is now " + max + " " + Arrays.toString(Arrays.copyOf(parts, partIndex)));
        mUpperBound = max;
      }
      return;
    }
    if (max(parts, partIndex) < mUpperBound) {
      for (int k = m; k > 0; --k) {
        final int r = remaining - k * k;
        if (r >= 0) {
          parts[partIndex] = k;
          search(remaining - k * k, parts, partIndex + 1, k);
        }
      }
    }
  }

  @Override
  public Z next() {
    mUpperBound = ++mN;
    final int[] parts = new int[mN];
    search(mN, parts, 0, IntegerUtils.sqrt(mN));
    return Z.valueOf(mUpperBound);
  }
}
