package irvine.oeis.a026;

import irvine.oeis.SumBetweenSequence;

/**
 * A026349 <code>a(n) =</code> sum of the numbers between the two n's in <code>A026346</code>.
 * @author Sean A. Irvine
 */
public class A026349 extends SumBetweenSequence {

  /** Construct the sequence. */
  public A026349() {
    super(new A026346());
  }
}
