package irvine.oeis.a024;

import irvine.oeis.PartialSumSequence;

/**
 * A024585 a(n) = Sum_{k=1..n} [ 1/{k*Pi} ], where {x} := x - [ x ].
 * @author Sean A. Irvine
 */
public class A024585 extends PartialSumSequence {

  /** Construct the sequence. */
  public A024585() {
    super(1, new A024584());
  }
}
