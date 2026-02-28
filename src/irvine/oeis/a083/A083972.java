package irvine.oeis.a083;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A083972 Smallest palindromic prime containing exactly n 1's.
 * @author Sean A. Irvine
 */
public class A083972 extends Sequence1 {

  private final StringBuilder mS = new StringBuilder();

  private void insertPair(final TreeSet<Z> set, final StringBuilder sb) {
    // Try double digit insertion
    for (int d = 0; d < 10; ++d) {
      if (d != 1) {
        for (int pos = 0; pos <= sb.length() / 2; ++pos) {
          final Z t2 = new Z(sb.substring(0, pos) + d + sb.substring(pos, sb.length() - pos) + d + sb.substring(sb.length() - pos));
          if (t2.isProbablePrime()) {
            set.add(t2);
          }
        }
      }
    }
  }

  @Override
  public Z next() {
    mS.append('1');
    final Z t0 = new Z(mS);
    if (t0.isProbablePrime()) {
      return t0; // already a palindrome
    }
    // Try single digit insertion
    if ((mS.length() & 1) == 0) {
      for (int d = 0; d < 10; ++d) {
        if (d != 1) {
          final String h = "1".repeat(mS.length() / 2);
          final Z t1 = new Z(h + d + h);
          if (t1.isProbablePrime()) {
            return t1;
          }
        }
      }
    }
    // Try double digit insertion
    final TreeSet<Z> set = new TreeSet<>();
    insertPair(set, mS);
    if (!set.isEmpty()) {
      return set.first();
    }
    // Try single digit insertion in middle and one other pair
    if ((mS.length() & 1) == 0) {
      for (int d = 0; d < 10; ++d) {
        if (d != 1) {
          final String h = "1".repeat(mS.length() / 2);
          insertPair(set, new StringBuilder(h).append(d).append(h));
        }
      }
    }
    if (!set.isEmpty()) {
      return set.first();
    }
    throw new UnsupportedOperationException("Existing rules insufficient");
  }
}
