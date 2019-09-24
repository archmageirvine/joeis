package irvine.oeis.a026;

import irvine.oeis.SumBetweenSequence;

/**
 * A026271 <code>a(n) =</code> sum of the numbers between the two n's in <code>A026242</code>.
 * @author Sean A. Irvine
 */
public class A026271 extends SumBetweenSequence {

  /** Construct the sequence. */
  public A026271() {
    super(new A026242());
  }
}
