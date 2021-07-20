package irvine.oeis.a066;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A066217 Numbers not ending in 0 which are the product of two substrings of themselves. The substrings may be equal, but each must be greater than 1.
 * @author Sean A. Irvine
 */
public class A066217 implements Sequence {

  private long mN = 24;

  private void propersubstrings(final String n, final HashSet<String> set) {
    if (n.charAt(0) != '0') {
      set.add(n);
    }
    for (int k = 1; k < n.length(); ++k) {
      propersubstrings(n.substring(0, k), set);
      propersubstrings(n.substring(k), set);
    }
  }

  @Override
  public Z next() {
    final HashSet<String> set = new HashSet<>();
    while (true) {
      if (++mN % 10 != 0) {
        set.clear();
        propersubstrings(String.valueOf(mN), set);
        set.remove("1");
        for (final String v : set) {
          final int w = Integer.parseInt(v);
          if (mN % w == 0 && set.contains(String.valueOf(mN / w))) {
            return Z.valueOf(mN);
          }
        }
      }
    }
  }
}
