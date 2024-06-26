package irvine.oeis.a170;
// Generated by gen_seq4.pl 2024-04-25/parmof4 at 2024-04-25 23:20

import irvine.oeis.a151.A151568;

/**
 * A170855 a(0) = 0, a(1) = 1; a(2^i + j) = a(j) + 3a(j + 1) for 0 &lt;= j &lt; 2^i.
 * @author Georg Fischer
 */
public class A170855 extends A151568 {

  /** Construct the sequence. */
  public A170855() {
    super(0, 1, 3, "0, 1");
  }
}
