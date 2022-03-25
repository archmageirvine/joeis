package irvine.oeis.a061;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A061694 Generalized Bell numbers.
 * <code>Table[Sum[Sum[(n!/(i!*j!*(n-i-j)!))^3/6, {i, 1, n-j-1}], {j, 1, n}], {n, 1, 20}]</code>
 * @author Georg Fischer
 */
public class A061694 implements Sequence {

  private int mN;
  private static final MemoryFactorial FACTORIAL = new MemoryFactorial();

  /** Construct the sequence. */
  public A061694() {
    mN = 0;
  }

  @Override
  public Z next() {
    ++mN;
    Q sumj = Q.ZERO;
    for (int j = 1; j <= mN; ++j) {
      Q sumi = Q.ZERO;
      for (int i = 1; i <= mN - j - 1; ++i) {
        sumi = sumi.add(new Q(FACTORIAL.factorial(mN),
          FACTORIAL.factorial(i).multiply(FACTORIAL.factorial(j)).multiply(FACTORIAL.factorial(mN - i - j))
        ).pow(3).divide(Z.SIX));
      }
      sumj = sumj.add(sumi);
    }
    return sumj.num();
  }
}
