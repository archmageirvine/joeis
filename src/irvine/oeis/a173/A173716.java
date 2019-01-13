package irvine.oeis.a173;

import java.util.LinkedList;

import irvine.math.z.Z;
import irvine.oeis.a001.A001358;

/**
 * A173716.
 * @author Sean A. Irvine
 */
public class A173716 extends A001358 {

  private final LinkedList<String> mSemi = new LinkedList<>();

  private void updateSemiprimes(final String s) {
    // Given new semiprime s, remove substring of s we have, then add
    // s to the list, this helps make the search easier later.
    // i.e. when we see 14, then 4 is removed from the list
    mSemi.removeIf(s::contains);
    mSemi.add(s);
  }

  private String place(final String z, final String s) {
    // It is always best to overlap if at all possible
    if (z.contains(s)) {
      return z;
    }
    for (int k = s.length() - 1; k > 0; --k) {
      if (z.endsWith(s.substring(0, k))) {
        return z + s.substring(k);
      }
    }
    return z + s;
  }

  /**
   * Find solutions by exhaustively trying to pack all the current semiprimes
   * into a string by trying every reasonable combination.  The final result
   * is the smallest such combination.
   *
   * @param best current best solution
   * @param z current partial solution
   * @param c number of semiprimes yet to be place
   * @param semis array of semiprimes
   * @return the best result
   */
  private String find(final String best, final String z, final int c, final String[] semis) {
    // Check if we have finished
    if (c == 0) {
      final int zl = z.length();
      final int bl = best.length();
      if (bl < zl) {
        return best;
      } else if (zl < bl) {
        return z;
      } else {
        return z.compareTo(best) < 0 ? z : best;
      }
    }
    // For each string in semi, place it at the left most possible and recurse
    String b = best;
    for (int k = 0; k < semis.length; ++k) {
      final String s = semis[k];
      if (s != null) {
        final String p = place(z, s);
        semis[k] = null;
        b = find(b, p, c - 1, semis);
        semis[k] = s;
      }
    }
    return b;
  }

  @Override
  public Z next() {
    updateSemiprimes(super.next().toString());
    final String[] semis = mSemi.toArray(new String[mSemi.size()]);
    final StringBuilder simple = new StringBuilder();
    for (final String s : semis) {
      simple.append(s);
    }
    return new Z(find(simple.toString(), "", semis.length, semis));
  }
}
