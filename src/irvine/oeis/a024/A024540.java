package irvine.oeis.a024;

import irvine.oeis.PartialSumSequence;

/**
 * A024540 <code>a(n) = Sum_{k=1..n} floor( 1/{k*sqrt(2)} )</code>, where <code>{x} := x - floor(x)</code>.
 * @author Sean A. Irvine
 */
public class A024540 extends PartialSumSequence {

  /** Construct the sequence. */
  public A024540() {
    super(new A024539());
  }
}
