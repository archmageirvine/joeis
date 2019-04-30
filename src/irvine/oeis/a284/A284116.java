package irvine.oeis.a284;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.StringUtils;

/**
 * A284116 <code>a(n) =</code> largest number of distinct words arising in Post's tag system <code>{00, 1101}</code> applied to a binary word w, over all starting words w of length n, or <code>a(n) = -1</code> if there is a word w with an unbounded trajectory.
 * @author Sean A. Irvine
 */
public class A284116 implements Sequence {

  private int mN = 0;

  private String post(final String w) {
    return (w.charAt(0) == '0' ? (w + "00") : (w + "1101")).substring(3);
  }

  private String word(final long k, final int len) {
    final String w = Long.toBinaryString(k);
    return w.length() < mN ? StringUtils.rep('0', len - w.length()) + w : w;
  }

  @Override
  public Z next() {
    ++mN;
    long best = 0;
    final HashSet<String> seen = new HashSet<>();
    final long limit = 1L << mN;
    for (long k = 0; k < limit; ++k) {
      seen.clear();
      long c = 0;
      String w = word(k, mN);
      while (seen.add(w)) {
        ++c;
        if (w.isEmpty()) {
          break;
        }
        w = post(w);
      }
      if (c > best) {
        best = c;
      }
    }
    return Z.valueOf(best);
  }
}
