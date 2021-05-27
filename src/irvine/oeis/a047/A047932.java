package irvine.oeis.a047;

import irvine.oeis.PartialSumSequence;

/**
 * A047932 a(n) = floor(3*n-sqrt(12*n-3)).
 * @author Sean A. Irvine
 */
public class A047932 extends PartialSumSequence {

  /** Construct the sequence. */
  public A047932() {
    super(new A047931());
  }
}
