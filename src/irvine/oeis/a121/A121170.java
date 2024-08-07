package irvine.oeis.a121;
// Generated by gen_seq4.pl 2023-10-19/filter at 2023-10-19 23:32

import irvine.oeis.FilterSequence;
import irvine.oeis.a060.A060385;

/**
 * A121170 Largest prime divisor of Fibonacci(5n).
 * @author Georg Fischer
 */
public class A121170 extends FilterSequence {

  /** Construct the sequence. */
  public A121170() {
    super(1, new A060385(), (n, v) -> n % 5 == 0);
  }
}
