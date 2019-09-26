package irvine.oeis.a026;

import irvine.oeis.SumBetweenSequence;

/**
 * A026361 <code>a(n) =</code> sum of the numbers between the two n's in <code>A026358</code>.
 * @author Sean A. Irvine
 */
public class A026361 extends SumBetweenSequence {

  /** Construct the sequence. */
  public A026361() {
    super(new A026358(), 2);
  }
}
