package irvine.oeis.a024;

import irvine.oeis.PartialSumSequence;

/**
 * A024585 <code>a(n) = Sum_{k=1..n} [ 1/{k*Pi} ]</code>, where <code>{x} := x - [ x ]</code>.
 * @author Sean A. Irvine
 */
public class A024585 extends PartialSumSequence {

  /** Construct the sequence. */
  public A024585() {
    super(new A024584());
  }
}
