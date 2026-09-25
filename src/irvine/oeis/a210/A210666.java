package irvine.oeis.a210;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A210666 Numbers with at least three digits in which all digits but one are the same.
 * @author Sean A. Irvine
 */
public class A210666 extends Sequence1 {

  // After Michael S. Branicky

  private final TreeSet<Z> mTerms = new TreeSet<>();
  private int mDigits = 3;

  private void generate(final int d) {
    final Set<String> terms = new HashSet<>();
    for (char most = '1'; most <= '9'; ++most) {
      // most followed by d-1 zeroes
      final String zero = most + "0".repeat(d - 1);
      terms.add(zero);
      // Replace one occurrence of most by a different digit
      for (char diff = '0'; diff <= '9'; ++diff) {
        if (most == diff) {
          continue;
        }
        for (int i = 0; i < d; ++i) {
          if (i == 0 && diff == '0') {
            continue;
          }
          final StringBuilder s = new StringBuilder(d);
          for (int j = 0; j < d; ++j) {
            s.append(j == i ? diff : most);
          }
          terms.add(s.toString());
        }
      }
    }
    for (final String s : terms) {
      mTerms.add(new Z(s));
    }
  }

  @Override
  public Z next() {
    if (mTerms.isEmpty()) {
      generate(mDigits++);
    }
    return mTerms.pollFirst();
  }
}
