package irvine.oeis.a054;
// Generated by gen_seq4.pl naronson at 2021-02-12 23:44
// DO NOT EDIT here!

import irvine.oeis.NumericalAronsonSequence;
import irvine.oeis.a000.A000045;

/**
 * A054049 Earliest sequence with a(a(n)) = Fibonacci(n+1).
 * @author Georg Fischer
 */
public class A054049 extends NumericalAronsonSequence {

  /** Construct the sequence. */
  public A054049() {
    super(0, new A000045(), 0);
    mSeq.next();
    mSeq.remove(0);
  }
}
