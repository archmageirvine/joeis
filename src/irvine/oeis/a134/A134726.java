package irvine.oeis.a134;
// Generated by gen_seq4.pl concatf/concatn at 2022-12-30 21:49

import irvine.oeis.a000.A000578;
import irvine.oeis.a133.A133013;

/**
 * A134726 Concatenation of next n cubes of positive integers.
 * @author Georg Fischer
 */
public class A134726 extends A133013 {

  /** Construct the sequence. */
  public A134726() {
    super(1, new A000578(), 10);
    mSeq.next();
  }
}
