package irvine.oeis.a393;

import java.util.HashSet;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A393997 allocated for Michel Lagneau.
 * @author Sean A. Irvine
 */
public class A393997 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    Q t = new Q(++mN, 2 * mN + 1);
    HashSet<Q> seen = new HashSet<>();
    while (seen.add(t)) {
      t = t.num().isEven() ? t.divide(2) : t.multiply(3).add(1);
    }
    return Z.valueOf(seen.size() - 1);
  }
}
