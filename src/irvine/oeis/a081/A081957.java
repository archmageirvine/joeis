package irvine.oeis.a081;

import java.util.Arrays;
import java.util.TreeSet;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A081957 Triangle whose n-th row contains the n smallest numbers that are products of n distinct integers &gt; 1, read by rows.
 * @author Sean A. Irvine
 */
public class A081957 extends Sequence1 {

  private int mN = 0;
  private int mM = 0;
  private Z mPrev = Z.ZERO;
  private final TreeSet<long[]> mA = new TreeSet<>((a, b) -> {
    final Z p = Functions.PRODUCT.z(a);
    final Z q = Functions.PRODUCT.z(b);
    final int c = p.compareTo(q);
    if (c != 0) {
      return c;
    }
    return Arrays.compare(a, b);
  });

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 0;
      mPrev = Z.ZERO;
      mA.clear();
      final long[] s = new long[mN];
      for (int k = 0; k < s.length; ++k) {
        s[k] = k + 2;
      }
      mA.add(s);
    }
    while (true) {
      final long[] v = mA.pollFirst();
      for (int k = 0; k < v.length - 1; ++k) { // Do every possible increase of earlier numbers
        if (v[k] + 1 < v[k + 1]) {
          final long[] vk = Arrays.copyOf(v, v.length);
          ++vk[k];
          mA.add(vk);
        }
      }
      final Z res = Functions.PRODUCT.z(v);
      ++v[v.length - 1]; // Increase last number
      mA.add(v);
      if (!res.equals(mPrev)) {
        mPrev = res;
        return res;
      }
    }
  }
}
