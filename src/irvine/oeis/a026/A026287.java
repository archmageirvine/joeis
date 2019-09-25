package irvine.oeis.a026;

import irvine.oeis.SumBetweenSequence;

/**
 * A026287 <code>a(n) =</code> sum of the numbers between the two n's in <code>A026284</code>.
 * @author Sean A. Irvine
 */
public class A026287 extends SumBetweenSequence {

  /** Construct the sequence. */
  public A026287() {
    super(new A026284());
  }
}
