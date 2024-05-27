package irvine.oeis.a069;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.Pair;

/**
 * A069886 Smallest multiple of n starting with 1 with descending digit string (a left substring of 10987654321098...), 0 if no such number exists.
 * @author Sean A. Irvine
 */
public class A069886 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    final HashSet<Pair<Long, Long>> seen = new HashSet<>();
    long a = 2;
    Z p = Z.ZERO;
    while (true) {
      if (--a < 0) {
        a = 9;
      }
      p = p.multiply(10).add(a);
      final long m = p.mod(mN);
      if (m == 0) {
        return p;
      }
      if (!seen.add(new Pair<>(m, a))) {
        return Z.ZERO;
      }
    }
  }
}
