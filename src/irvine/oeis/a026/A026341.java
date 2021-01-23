package irvine.oeis.a026;

import irvine.oeis.SumBetweenSequence;

/**
 * A026341 a(n) = sum of the numbers between the two n's in A026338.
 * @author Sean A. Irvine
 */
public class A026341 extends SumBetweenSequence {

  /** Construct the sequence. */
  public A026341() {
    super(new A026338());
  }
}
