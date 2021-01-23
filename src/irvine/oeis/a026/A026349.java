package irvine.oeis.a026;

import irvine.oeis.SumBetweenSequence;

/**
 * A026349 a(n) = sum of the numbers between the two n's in A026346.
 * @author Sean A. Irvine
 */
public class A026349 extends SumBetweenSequence {

  /** Construct the sequence. */
  public A026349() {
    super(new A026346());
  }
}
