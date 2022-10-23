package irvine.oeis.a342;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A342846 Number of distinct odd numbers visible as proper substrings of n.
 * @author Sean A. Irvine
 */
public class A342846 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final String s = String.valueOf(++mN);
    final HashSet<String> seen = new HashSet<>();
    for (int k = s.length() - 1; k >= 0; --k) {
      if ((s.charAt(k) & 1) == 1) {
        for (int j = k; j >= 0; --j) {
          if (s.charAt(j) != '0') {
            seen.add(s.substring(j, k + 1));
          }
        }
      }
    }
    seen.remove(s); // not proper!
    return Z.valueOf(seen.size());
  }
}
