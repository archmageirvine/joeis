package irvine.oeis.a166;
// manually trecpas/trecpas1

/**
 * A166962 Triangle T(n,k) read by rows: T(n,1) = T(n,n)=1, otherwise T(n,k) = (3n-3k+1)*T(n-1,k-1) + k*(3k-2)*T(n-1,k), 1&lt;=k&lt;=n.
 * @author Georg Fischer
 */
public class A166962 extends A166960 {

  /** Construct the sequence. */
  public A166962() {
    super(3);
  }
}
