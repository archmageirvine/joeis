package irvine.oeis.a024;

import irvine.oeis.PartialSumSequence;

/**
 * A024565 <code>a(n) = Sum_{k=1..n} [ 1/{k*sqrt(7)} ]</code> where <code>{x} := x - [ x ]</code>.
 * @author Sean A. Irvine
 */
public class A024565 extends PartialSumSequence {

  /** Construct the sequence. */
  public A024565() {
    super(new A024564());
  }
}
