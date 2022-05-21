package irvine.oeis.a166;
// manually trecpas/trecpas1

/**
 * A166961 Triangle T(n,k) read by rows: T(n,k) = (m*n - m*k + 1)*T(n - 1, k - 1) + k*(m*k - (m - 1))*T(n - 1, k) where m = 2.
 * @author Georg Fischer
 */
public class A166961 extends A166960 {

  /** Construct the sequence. */
  public A166961() {
    super(2);
  }
}
