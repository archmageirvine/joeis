package irvine.oeis.a079;

import java.util.HashSet;
import java.util.Set;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A079790 a(n) = number of m &lt;= n which can be obtained by deleting digits from n.
 * @author Sean A. Irvine
 */
public class A079790 extends Sequence1 {

  private long mN = 0;

  private void search(final Set<String> set, final String s) {
    if ((s.charAt(0) != '0' || s.length() == 1) && set.add(s) && s.length() > 1) {
      for (int k = 0; k < s.length(); ++k) {
        search(set, s.substring(0, k) + s.substring(k + 1));
      }
    }
  }

  @Override
  public Z next() {
    final String s = String.valueOf(++mN);
    final HashSet<String> seen = new HashSet<>();
    search(seen, s);
    return Z.valueOf(seen.size());
  }
}

