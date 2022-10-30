package irvine.oeis.a024;

import irvine.oeis.PartialSumSequence;

/**
 * A024565 a(n) = Sum_{k=1..n} [ 1/{k*sqrt(7)} ] where {x} := x - [ x ].
 * @author Sean A. Irvine
 */
public class A024565 extends PartialSumSequence {

  /** Construct the sequence. */
  public A024565() {
    super(1, new A024564());
  }
}
