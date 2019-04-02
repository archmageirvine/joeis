package irvine.oeis.a006;

import java.util.ArrayList;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006156 Number of ternary squarefree words of length n.
 * @author Sean A. Irvine
 */
public class A006156 implements Sequence {

  protected ArrayList<String> mWords = new ArrayList<>();

  private boolean isSquareFreeWord(final String s) {
    // Assumes that s[1] .. s[length - 1] is already square free
    for (int k = 1; k <= s.length() / 2; ++k) {
      if (s.substring(k).startsWith(s.substring(0, k))) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    if (mWords.isEmpty()) {
      mWords.add("");
    } else {
      final ArrayList<String> next = new ArrayList<>();
      for (final String w : mWords) {
        final String a = "a" + w;
        if (isSquareFreeWord(a)) {
          next.add(a);
        }
        final String b = "b" + w;
        if (isSquareFreeWord(b)) {
          next.add(b);
        }
        final String c = "c" + w;
        if (isSquareFreeWord(c)) {
          next.add(c);
        }
      }
      mWords = next;
    }
    return Z.valueOf(mWords.size());
  }
}

