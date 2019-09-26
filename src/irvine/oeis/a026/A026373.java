package irvine.oeis.a026;

import irvine.oeis.SumBetweenSequence;

/**
 * A026373 <code>a(n) =</code> sum of the numbers between the two n's in <code>A026370</code>.
 * @author Sean A. Irvine
 */
public class A026373 extends SumBetweenSequence {

  /** Construct the sequence. */
  public A026373() {
    super(new A026370(), 2);
  }
}
