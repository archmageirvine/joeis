package irvine.oeis.a390;

import java.util.ArrayList;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.a003.A003056;
import irvine.oeis.a249.A249223;

/**
 * A390628 Numbers k such that the symmetric representation of sigma, SRS(k), and SRS(2k) have the same width pattern.
 * @author Sean A. Irvine
 */
public class A390628 extends A249223 {

  private final DirectSequence mRowLengths = new A003056();
  private int mN = 0;

  /**
   * Return the width pattern for a number.
   * @param n number
   * @return with pattern
   */
  public ArrayList<Long> widthPattern(final int n) {
    final int len = mRowLengths.a(n).intValueExact();
    // Get forward terms
    final ArrayList<Long> pattern = new ArrayList<>();
    for (int k = 1; k <= len; ++k) {
      pattern.add(t(n, k));
    }
    // Append reverse of elements
    final int size = pattern.size();
    for (int k = 0; k < size; ++k) {
      pattern.add(pattern.get(size - k - 1));
    }
    final ArrayList<Long> unique = new ArrayList<>();
    for (int k = 0; k < pattern.size(); ++k) {
      if (k == 0 || !pattern.get(k).equals(pattern.get(k - 1))) {
        unique.add(pattern.get(k));
      }
    }
    return unique;
  }

  @Override
  public Z next() {
    while (true) {
      final ArrayList<Long> pat1 = widthPattern(++mN);
      final ArrayList<Long> pat2 = widthPattern(2 * mN);
      if (pat1.equals(pat2)) {
        return Z.valueOf(mN);
      }
    }
  }
}
