package irvine.oeis.a373;
// Generated by gen_seq4.pl 2024-11-27.ack/mulr at 2024-11-27 22:04

import irvine.oeis.MultiplicativeSequence;

/**
 * A373129 a(n) = Sum_{1 &lt;= x_1, x_2 &lt;= n} sigma( n/gcd(x_1, x_2, n) ).
 * Multiplicative with:
 * @author Georg Fischer
 */
public class A373129 extends MultiplicativeSequence {

  /** Construct the sequence. */
  public A373129() {
    super(1, (p, e) -> p.pow(3L * e + 2).multiply(p.add(1)).subtract(p.pow(2L * e).multiply(p.square().add(p.add(1)))).add(p).divide(p.pow(3).subtract(1)));
  }
}
