package irvine.oeis.a024;

import irvine.oeis.PartialSumSequence;

/**
 * A024570 a(n) = Sum_{k=1..n} [ 1/{k*r} ] where r = (1 + sqrt(5))/2 and {x} := x - [ x ].
 * @author Sean A. Irvine
 */
public class A024570 extends PartialSumSequence {

  /** Construct the sequence. */
  public A024570() {
    super(1, new A024569());
  }
}
