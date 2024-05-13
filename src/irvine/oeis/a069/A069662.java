package irvine.oeis.a069;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069055.
 * @author Sean A. Irvine
 */
public class A069662 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.SEVEN;
    }
    final String t = "9".repeat(mN - 1);
    // t by itself can never be prime, always divisible by 3
    // Try reducing the sum by 1, meaning there is a single 8
    for (int k = t.length(); k >= 0; --k) {
      final Z u = new Z(t.substring(0, k) + '8' + t.substring(k));
      if (u.isProbablePrime()) {
        return u;
      }
    }
    // Try reducing the sum by 2, meaning there is two 8 or a single 7
    final TreeSet<Z> soln = new TreeSet<>();
    for (int k = t.length(); k >= 0; --k) {
      final Z u = new Z(t.substring(0, k) + '7' + t.substring(k));
      if (u.isProbablePrime()) {
        soln.add(u);
        break;
      }
    }
    final String v = t.substring(0, t.length() - 1);
    outer:
    for (int k = v.length(); k >= 0; --k) {
      for (int j = v.length(); j >= k; --j) {
        final Z u = new Z(v.substring(0, k) + '8' + v.substring(k, j) + '8' + v.substring(j));
        if (u.isProbablePrime()) {
          soln.add(u);
          break outer;
        }
      }
    }
    return soln.last();
  }
}
