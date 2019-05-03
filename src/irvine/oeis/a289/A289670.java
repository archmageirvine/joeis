package irvine.oeis.a289;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.StringUtils;

/**
 * A289670 Consider the Post tag system defined in <code>A284116; a(n) =</code> number of binary words of length n which terminate at the empty word.
 * @author Sean A. Irvine
 */
public class A289670 implements Sequence {

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
    long count = 0;
    final HashSet<String> seen = new HashSet<>();
    final long limit = 1L << mN;
    for (long k = 0; k < limit; ++k) {
      seen.clear();
      String w = word(k, mN);
      while (seen.add(w)) {
        if (w.isEmpty()) {
          ++count;
          break;
        }
        w = post(w);
      }
    }
    return Z.valueOf(count);
  }
}
