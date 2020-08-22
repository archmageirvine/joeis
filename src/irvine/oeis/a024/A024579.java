package irvine.oeis.a024;

import irvine.oeis.PartialSumSequence;

/**
 * A024579 a(n) = Sum_{k=1..n} [ 1/{k/e} ], where {x} := x - [ x ].
 * @author Sean A. Irvine
 */
public class A024579 extends PartialSumSequence {

  /** Construct the sequence. */
  public A024579() {
    super(new A024578());
  }
}
