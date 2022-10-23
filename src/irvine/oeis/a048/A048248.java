package irvine.oeis.a048;

import java.util.Arrays;
import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A048248 Possible traces of n-step walks on 1-D lattice, ignoring translations.
 * @author Sean A. Irvine
 */
public class A048248 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    final HashSet<String> traces = new HashSet<>();
    final int[] cnts = new int[2 * mN + 3]; // big enough to always have a 0 at each end, saves checking later
    for (long path = 0; path < 1L << mN; ++path) {
      int pos = mN + 1;
      Arrays.fill(cnts, 0);
      long p = path;
      for (int j = 0; j < mN; ++j) {
        if ((p & 1) == 0) {
          ++cnts[pos++];
        } else {
          ++cnts[--pos];
        }
        p >>>= 1;
      }
      // Find the span of the trace
      int start = mN;
      while (cnts[start] != 0) {
        --start;
      }
      int end = mN + 1;
      while (cnts[end] != 0) {
        ++end;
      }
      // Collect the trace
      final StringBuilder sb = new StringBuilder();
      while (++start < end) {
        sb.append(cnts[start]).append(',');
      }
      traces.add(sb.toString());
    }
    return Z.valueOf(traces.size());
  }
}
