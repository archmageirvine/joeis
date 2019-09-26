package irvine.oeis.a026;

import irvine.oeis.SumBetweenSequence;

/**
 * A026357 <code>a(n) =</code> sum of the numbers between the two n's in <code>A026354</code>.
 * @author Sean A. Irvine
 */
public class A026357 extends SumBetweenSequence {

  /** Construct the sequence. */
  public A026357() {
    super(new A026354(), 3);
  }
}
