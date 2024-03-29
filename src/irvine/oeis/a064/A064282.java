package irvine.oeis.a064;
// Generated by gen_seq4.pl transpose at 2022-10-25 23:07

import irvine.oeis.a127.A127898;
import irvine.oeis.triangle.Transpose;

/**
 * A064282 Triangle read by rows: T(n,k) = binomial(3n+3, k)*(n-k+1)/(n+1).
 * @author Georg Fischer
 */
public class A064282 extends Transpose {

  /** Construct the sequence. */
  public A064282() {
    super(new A127898());
  }
}
