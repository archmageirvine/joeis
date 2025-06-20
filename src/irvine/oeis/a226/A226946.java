package irvine.oeis.a226;
// Generated by gen_seq4.pl 2025-06-15.ack/complem at 2025-06-15 21:33

import irvine.oeis.ComplementSequence;
import irvine.oeis.a034.A034017;

/**
 * A226946 Numbers that can't be written as x^2 + x*y + y^2, with 0 &lt;= x &lt;= y and gcd(x,y) = 1.
 * @author Georg Fischer
 */
public class A226946 extends ComplementSequence {

  /** Construct the sequence. */
  public A226946() {
    super(1, new A034017());
  }
}
