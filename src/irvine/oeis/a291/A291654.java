package irvine.oeis.a291;

import java.util.HashSet;
import java.util.Set;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A291654 Number of distinct values in the prime tree starting with n.
 * @author Sean A. Irvine
 */
public class A291654 implements Sequence {

  private long mN = 0;

  private void search(final Set<Z> seen, final Z n) {
    if (seen.add(n)) {
      final Z ns = n.square();
      final Z c1 = ns.add(n).add(1);
      if (c1.isProbablePrime()) {
        search(seen, c1);
      }
      final Z c2 = ns.add(n).subtract(1);
      if (c2.isProbablePrime()) {
        search(seen, c2);
      }
      final Z c3 = ns.subtract(n).add(1);
      if (c3.isProbablePrime()) {
        search(seen, c3);
      }
      final Z c4 = ns.subtract(n).subtract(1);
      if (c4.isProbablePrime()) {
        search(seen, c4);
      }
    }
  }

  @Override
  public Z next() {
    ++mN;
    final HashSet<Z> seen = new HashSet<>();
    search(seen, Z.valueOf(mN));
    return Z.valueOf(seen.size());
  }
}
