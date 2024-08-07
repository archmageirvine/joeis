package irvine.oeis.a090;
// Generated by gen_seq4.pl 2024-07-24.ack/lambdin at 2024-07-24 22:30

import irvine.oeis.DirectSequence;
import irvine.oeis.LambdaSequence;
import irvine.oeis.a006.A006880;

/**
 * A090226 Least k such that prime(k) has n digits. Index of least n-digit prime.
 * @author Georg Fischer
 */
public class A090226 extends LambdaSequence {

  private static final DirectSequence A006880 = new A006880();

  /** Construct the sequence. */
  public A090226() {
    super(1, n -> A006880.a(n - 1).add(1), "1");
  }
}
