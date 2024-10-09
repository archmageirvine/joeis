package irvine.oeis.a072;

import irvine.math.MemoryFunction1;
import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072523.
 * @author Sean A. Irvine
 */
public class A072526 extends Sequence1 {

  private int mN = 0;

  private final MemoryFunction1<Q> mB = new MemoryFunction1<>() {
    @Override
    protected Q compute(final int n) {
      if (n <= 1) {
        return Q.ZERO;
      }
      final Z zn = Z.valueOf(n);
      final Q t = Rationals.SINGLETON.sum(1, n - 1, i -> new Q(i, n).pow(i).multiply(new Q(n - i, n).pow(n - i - 1)).multiply(Binomial.binomial(n, i)).multiply(mB.get(i)));
      final Q u = Rationals.SINGLETON.sum(0, n, k -> new Q(zn.pow(k), Functions.FACTORIAL.z(k)));
      return u.multiply(Functions.FACTORIAL.z(n)).divide(Z.EIGHT.multiply(n + 1).multiply(zn.pow(n - 2)))
        .add(t.divide(n + 1))
        .subtract(new Q((long) n * n, 4L * (n + 1)));
    }
  };

  protected Z select(final Q n) {
    return n.num();
  }

  @Override
  public Z next() {
    return select(mB.get(++mN));
  }
}
