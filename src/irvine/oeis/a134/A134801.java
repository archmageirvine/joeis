package irvine.oeis.a134;
// Generated by gen_seq4.pl concatf/concatn at 2022-12-30 21:49

import irvine.oeis.a000.A000041;
import irvine.oeis.a133.A133013;

/**
 * A134801 Concatenation of next n partition numbers of positive integers.
 * @author Georg Fischer
 */
public class A134801 extends A133013 {

  /** Construct the sequence. */
  public A134801() {
    super(1, new A000041(), 10);
    mSeq.next();
  }
}
