package irvine.oeis.a026;

import irvine.oeis.SumBetweenSequence;

/**
 * A026353 a(n) = sum of the numbers between the two n's in A026350.
 * @author Sean A. Irvine
 */
public class A026353 extends SumBetweenSequence {

  /** Construct the sequence. */
  public A026353() {
    super(2, new A026350(), 2);
  }
}
