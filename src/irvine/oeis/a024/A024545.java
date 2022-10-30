package irvine.oeis.a024;

import irvine.oeis.PartialSumSequence;

/**
 * A024545 a(n) = Sum_{k=1..n} floor( 1/{k/sqrt(2)} ), where {x} := x - floor(x).
 * @author Sean A. Irvine
 */
public class A024545 extends PartialSumSequence {

  /** Construct the sequence. */
  public A024545() {
    super(1, new A024544());
  }
}
