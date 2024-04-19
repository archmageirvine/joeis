package irvine.oeis.a001;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A001171 From least significant term in expansion of E( tr (X'*X)^n ), X rectangular and Gaussian. Also number of types of sequential n-swap moves for traveling salesman problem.
 * @author Sean A. Irvine
 */
public class A001171 extends Sequence1 {

  private final MemoryFactorial mF = MemoryFactorial.SINGLETON;
  private int mN = 0;

  private Q c(final int a, final int b, final int k) {
    final int d = a - b + 1;
    final Z z = Z.ONE.shiftLeft(d).multiply(k).multiply(2L * (a - b) + 1).multiply(Functions.FACTORIAL.z(a - 1));
    final Z y = (d & 1) == 0 ? z : z.negate();
    final Z x = Functions.FACTORIAL.z(k - a - b).multiply(k + d).multiply(k + a - b).multiply(k - a + b).multiply(k - a + b - 1).multiply(Functions.FACTORIAL.z(2 * a - 1)).multiply(Functions.FACTORIAL.z(b - 1));
    final Q w = new Q(y, x);
    return (k & 1) == 0 ? w : w.negate();
  }

  @Override
  public Z next() {
    ++mN;
    Q t = new Q(Functions.FACTORIAL.z(mN).multiply(Functions.FACTORIAL.z(mN - 1).square()).shiftLeft(3L * mN - 2), Functions.FACTORIAL.z(2 * mN));
    for (int a = 1; a < mN; ++a) {
      Q u = Q.ZERO;
      for (int b = 1; b <= Math.min(a, mN - a); ++b) {
        final Q v = new Q(Functions.FACTORIAL.z(2 * b).multiply(Functions.FACTORIAL.z(a - 1)).multiply(Functions.FACTORIAL.z(mN - a - b + 1)).shiftLeft(a - b - 1), Functions.FACTORIAL.z(b).multiply(2L * b - 1));
        u = u.add(c(a, b, mN).multiply(v.square()));
      }
      t = t.add(u);
    }
    return t.toZ();
  }
}
