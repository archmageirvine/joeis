package irvine.oeis.a024;

import irvine.oeis.PartialSumSequence;

/**
 * A024554 <code>a(n) = Sum_{k=1..n} floor( 1/{k*sqrt(5)} )</code>, where <code>{x} := x - floor(x)</code>.
 * @author Sean A. Irvine
 */
public class A024554 extends PartialSumSequence {

  /** Construct the sequence. */
  public A024554() {
    super(new A024553());
  }
}
