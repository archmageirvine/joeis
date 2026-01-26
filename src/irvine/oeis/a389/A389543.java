package irvine.oeis.a389;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.Pair;

/**
 * A389543 a(n) is the largest value t such that the sequence defined by b(t+2) = (b(t+1) * b(t)) mod n with b(1) = b(2) = 2 mod n where all pairs of terms {b(t-1),b(t)} are distinct.
 * @author Sean A. Irvine
 */
public class A389543 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    final HashSet<Pair<Long, Long>> seen = new HashSet<>();
    Pair<Long, Long> s = new Pair<>(2 % mN, 2 % mN);
    while (seen.add(s)) {
      s = new Pair<>(s.right(), s.left() * s.right() % mN);
    }
    return Z.valueOf(seen.size() + 1);
  }
}
