package irvine.oeis.a005;

import irvine.math.MemoryFunction2;
import irvine.math.partitions.IntegerPartition;
import irvine.math.q.Q;
import irvine.math.z.Z;

/**
 * A005947 Tumbling distance for n-input mappings with 2 steps.
 * @author Sean A. Irvine
 */
public class A005947 extends A005946 {

  protected class QFunction extends MemoryFunction2<Integer, Q> {

    private Q lambdaPar(final int[] lambda, final int n, final int m) {
      // Eqn (20)
      Q sum = Q.ZERO;
      for (int i = 1; i <= n; ++i) {
        sum = sum.add(get(i, m - 1).multiply(i).multiply(i).add(m * (long) (n - i) * i).multiply(lambda[i]));
      }
      return sum.divide(n).divide(n);
    }

    @Override
    protected Q compute(final Integer n, final Integer m) {
      if (m == 1) {
        return new Q(n - 1, n);
      }
      if (n == 2) {
        return new Q(m + 1, 4);
      }
      final Z hnm = A005947.this.get(n, m);
      // Eqn (21) Hogg & Huberman
      Q sum = Q.ZERO;
      final IntegerPartition part = new IntegerPartition(n);
      final int[] lambda = new int[n + 1];
      int[] p;
      while ((p = part.next()) != null) {
        IntegerPartition.toCountForm(p, lambda);
        Q t = Q.ONE;
        for (int k = 1; k < lambda.length; ++k) {
          t = t.multiply(A005947.this.get(k, m - 1).pow(lambda[k]));
        }
        t = t.multiply(lambdaPar(lambda, n, m));
        t = t.multiply(FACTORIAL.factorial(n));
        t = t.divide(per(lambda));
        sum = sum.add(t);
      }
      return sum.divide(hnm);
    }
  }

  protected final QFunction mQ = new QFunction();

  @Override
  public Z next() {
//    for (int m = 1; m < 5; ++m) {
//      for (int n = 1; n < 5; ++n) {
//        System.out.println("m=" + m + " n=" + n + " " + mQ.get(n, m));
//      }
//    }
    return mQ.get(++mN, 2).multiply(get(mN, 2)).multiply(mN).toZ();
  }
}
