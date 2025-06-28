package irvine.oeis.a078;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import irvine.math.MemoryFunction1;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A078389 Number of different values obtained by evaluating all different parenthesizations of 1/2/3/4/.../n.
 * @author Sean A. Irvine
 */
public class A078389 extends Sequence1 {

  // After Alois P. Heinz

  private int mN = 0;
  private final MemoryFunction1<Set<Q>> mP = new MemoryFunction1<>() {
    @Override
    protected Set<Q> compute(final int n) {
      if (n < 1) {
        return Collections.emptySet();
      }
      if (n == 1) {
        return Collections.singleton(Q.ONE);
      }
      if (n == 2) {
        return Collections.singleton(Q.HALF);
      }
      final HashSet<Q> res = new HashSet<>();
      for (final Q v : get(n - 1)) {
        res.add(v.divide(n));
        res.add(v.multiply(n));
      }
      return res;
    }
  };

  @Override
  public Z next() {
    return Z.valueOf(mP.get(++mN).size());
  }
}

