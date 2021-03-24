package irvine.oeis.a342;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A342845.
 * @author Sean A. Irvine
 */
public class A342845 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    final String s = String.valueOf(++mN);
    final HashSet<String> seen = new HashSet<>();
    for (int k = s.length() - 1; k >= 0; --k) {
      if ((s.charAt(k) & 1) == 0) {
        for (int j = k; j >= 0; --j) {
          if (j == k || s.charAt(j) != '0') {
            seen.add(s.substring(j, k + 1));
          }
        }
      }
    }
    seen.remove(s); // not proper!
    return Z.valueOf(seen.size());
  }
}
