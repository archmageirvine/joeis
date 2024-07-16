package irvine.oeis.a213;

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.a055.A055314;
import irvine.oeis.triangle.DirectArray;
import irvine.oeis.triangle.LambdaTable;

/**
 * A213262 Triangle read by rows: R*(n,k) (n&gt;=2, k from 2 to n-1 or to 2 if n = 2), where R*(n,k) = number of trees with n nodes and k unlabeled end-nodes.
 * where R*(n,k) = number of trees with n nodes and k unlabeled end-nodes.
 * @author Georg Fischer
 */
public class A213262 extends LambdaTable {

  private static final DirectArray A055314 = new A055314();

  /** Construct the sequence. */
  public A213262() {
    super(2, 2, n -> new Integer[] {2, (n == 2) ? 2 : n - 1}, (n, k) -> {
      // this is R*(n, k)
      if (k == 2) {
        if (n <= 4) {
          return Z.ONE;
        } else {
          return Functions.FACTORIAL.z(n - 2).divide2();
        }
      }
      if (k <= n - 2) {
        Z s = Z.ZERO;
        for (int i = 2; i <= n; ++i) {
          s = s.add(Binomial.binomial(n - i - 1, k - i).multiply(A055314.a(n - k, i)));
        }
        return s;
      }
      return k == n - 1 ? Z.ONE : Z.ZERO;
    });
  }
}
