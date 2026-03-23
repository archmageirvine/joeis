package irvine.oeis.a224;

import java.util.HashSet;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A224299 Collatz problem with rational negative numbers: number of steps to reach the end of the cycle starting with 1/(2n+1) where n is negative (the initial term is not counted).
 * @author Sean A. Irvine
 */
public class A224299 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    if (--mN == -1) {
      return Z.ZERO;
    }
    Q t = new Q(1, 2 * mN + 1);
    final HashSet<Q> seen = new HashSet<>();
    long cnt = -1;
    while (seen.add(t)) {
      ++cnt;
      t = t.num().isEven() ? t.divide(2) : t.multiply(3).add(1);
    }
    if (t.equals(Q.TWO)) {
      --cnt;
    }
    return Z.valueOf(cnt);
  }
}
