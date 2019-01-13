package irvine.oeis.a001;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.math.factorial.MemoryFactorial;
import irvine.oeis.Sequence;

/**
 * A001171.
 * @author Sean A. Irvine
 */
public class A001171 implements Sequence {

  private final MemoryFactorial mF = new MemoryFactorial();
  private int mN = 0;

  private Q c(final int a, final int b, final int k) {
    final int d = a - b + 1;
    final Z z = Z.ONE.shiftLeft(d).multiply(k).multiply(2L * (a - b) + 1).multiply(mF.factorial(a - 1));
    final Z y = (d & 1) == 0 ? z : z.negate();
    final Z x = mF.factorial(k - a - b).multiply(k + d).multiply(k + a - b).multiply(k - a + b).multiply(k - a + b - 1).multiply(mF.factorial(2 * a - 1)).multiply(mF.factorial(b - 1));
    final Q w = new Q(y, x);
    return (k & 1) == 0 ? w : w.negate();
  }

  @Override
  public Z next() {
    ++mN;
    Q t = new Q(mF.factorial(mN).multiply(mF.factorial(mN - 1).square()).shiftLeft(3 * mN - 2), mF.factorial(2 * mN));
    for (int a = 1; a < mN; ++a) {
      Q u = Q.ZERO;
      for (int b = 1; b <= Math.min(a, mN - a); ++b) {
        final Q v = new Q(mF.factorial(2 * b).multiply(mF.factorial(a - 1)).multiply(mF.factorial(mN - a - b + 1)).shiftLeft(a - b - 1), mF.factorial(b).multiply(2 * b - 1));
        u = u.add(c(a, b, mN).multiply(v.square()));
      }
      t = t.add(u);
    }
    return t.toZ();
  }
}
