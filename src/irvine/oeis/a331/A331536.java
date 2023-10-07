package irvine.oeis.a331;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A331536 Number of theorems in the MIU formal system which can be proved in n steps or fewer starting with the axiom 'mi'.
 * @author Sean A. Irvine
 */
public class A331536 extends Sequence1 {

  private final HashSet<String> mSeen = new HashSet<>(); // everything so far
  private HashSet<String> mNewlySeen = new HashSet<>(); // those that were new this iteration

  private void add(final HashSet<String> evolved, final String word) {
    if (!mSeen.contains(word)) {
      evolved.add(word);
    }
  }

  @Override
  public Z next() {
    if (mSeen.isEmpty()) {
      mSeen.add("i");
      mNewlySeen.add("i");
    } else {
      final HashSet<String> evolved = new HashSet<>(10 * mNewlySeen.size());
      for (final String word : mNewlySeen) {
        add(evolved, word + word);
        if (word.endsWith("i")) {
          add(evolved, word + "u");
        }
        for (int i3 = word.indexOf("iii"); i3 != -1; i3 = word.indexOf("iii", i3 + 1)) {
          add(evolved, word.substring(0, i3) + "u" + word.substring(i3 + 3));
        }
        for (int u2 = word.indexOf("uu"); u2 != -1; u2 = word.indexOf("uu", u2 + 1)) {
          add(evolved, word.substring(0, u2) + word.substring(u2 + 2));
        }
      }
      mNewlySeen = evolved;
      mSeen.addAll(evolved);
    }
    return Z.valueOf(mSeen.size());
  }
}
