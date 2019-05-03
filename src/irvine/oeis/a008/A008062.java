package irvine.oeis.a008;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008062 <code>a(n) =</code> maximal value of m such that an n X m radar array exists. <code>(A (0,1)</code> matrix A such that any horizontal shift of A overlaps A in at most a single <code>1.)</code>.
 * @author Sean A. Irvine
 */
public class A008062 implements Sequence {

  private int mN = 0;

  private HashSet<String> step(final HashSet<String> surprising, final int n) {
    // n is alphabet size
    final HashSet<String> next = new HashSet<>(surprising.size());
    for (final String s : surprising) {
      for (char c = 'A'; c < 'A' + n; ++c) {
        if (c > 'A' && s.indexOf(c - 1) < 0) {
          break; // WLOG can assume all lower characters appear at least once before this character
        }
        // We are considering adding c at the end of s
        boolean isSurprising = true;
        for (int k = s.length() - 1, d = 1; k > 0 && isSurprising; --k, ++d) {
          final char ck = s.charAt(k);
          for (int j = s.lastIndexOf(c); j >= d; j = s.lastIndexOf(c, j - 1)) {
            if (s.charAt(j - d) == ck) {
              isSurprising = false;
              break;
            }
          }
        }
        if (isSurprising) {
          next.add(s + c);
        }
      }
    }
    return next;
  }

  @Override
  public Z next() {
    ++mN;
    HashSet<String> surprising = new HashSet<>();
    surprising.add("A");
    int len = 0;
    while (!surprising.isEmpty()) {
      ++len;
      surprising = step(surprising, mN);
      //System.out.println(mN + " " + len + " " + surprising.size());
    }
    return Z.valueOf(len);
  }
}

