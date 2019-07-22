package irvine.oeis.a024;

import irvine.oeis.PartialSumSequence;

/**
 * A024545 <code>a(n) = Sum_{k=1..n} floor( 1/{k/sqrt(2)} )</code>, where <code>{x} := x - floor(x)</code>.
 * @author Sean A. Irvine
 */
public class A024545 extends PartialSumSequence {

  /** Construct the sequence. */
  public A024545() {
    super(new A024544());
  }
}
