package irvine.oeis.a127;
// Generated by gen_seq4.pl 2024-07-16/trilambn at 2024-07-16 22:37

import irvine.math.z.Integers;
import irvine.oeis.a054.A054522;
import irvine.oeis.triangle.DirectArray;
import irvine.oeis.triangle.LambdaTriangle;

/**
 * A127481 Triangle T(n,k) read by rows: T(n,k) = sum_{l=k..n, l|n, k|l} l*phi(k).
 * @author Georg Fischer
 */
public class A127481 extends LambdaTriangle {

  private static final DirectArray A054522 = new A054522();
  private static final DirectArray A127093 = new A127093();

  /** Construct the sequence. */
  public A127481() {
    super(1, 1, 1, (n, k) -> Integers.SINGLETON.sum(k, n, j -> A127093.a(n, j).multiply(A054522.a(j, k))));
  }
}
