package irvine.oeis.a151;

import irvine.math.z.Z;
import irvine.oeis.a213.A213262;
import irvine.oeis.triangle.DirectArray;
import irvine.oeis.triangle.LambdaTable;

/**
 * A151880 Triangle: R*(n,k) (n&gt;=2, k from 2 to n-1 or to 2 if n = 2), where R*(n,k) = number of trees with n nodes and k unlabeled end-nodes.
 * where R*(n,k) = number of trees with n nodes and k unlabeled end-nodes.
 * @author Georg Fischer
 */
public class A151880 extends LambdaTable {

  private static final DirectArray A213262 = new A213262();

  /** Construct the sequence. */
  public A151880() {
    super(0, 2, n -> new Integer[] {2, (n == 2) ? 2 : n - 1}, (n, k) -> (n == 2) ? Z.ONE : A213262.a(n, n + 1 - k));
  }

}
