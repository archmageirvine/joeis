package irvine.oeis.a024;

import irvine.oeis.PartialSumSequence;

/**
 * A024574 a(n) = Sum_{k=1..n} [ 1/{k*e} ] where {x} := x - [ x ].
 * @author Sean A. Irvine
 */
public class A024574 extends PartialSumSequence {

  /** Construct the sequence. */
  public A024574() {
    super(1, new A024573());
  }
}
