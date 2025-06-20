package irvine.oeis.a101;
// Generated by gen_seq4.pl 2025-06-16.ack/ratos at 2025-06-16 21:55

import irvine.oeis.recur.RationalRecurrence;

/**
 * A101683 Write exp(sqrt(1+x)-1) = Sum c(n) x^n/n!; then a(n) = numerator of c(n).
 * @author Georg Fischer
 */
public class A101683 extends RationalRecurrence {

  /** Construct the sequence. */
  public A101683() {
    super(0, "[[0],[-1],[-6,4],[4]]", "1", 0, 0);
  }
}
