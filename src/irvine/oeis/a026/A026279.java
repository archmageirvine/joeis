package irvine.oeis.a026;

import irvine.oeis.SumBetweenSequence;

/**
 * A026279 <code>a(n) =</code> sum of the numbers between the two n's in <code>A026276</code>.
 * @author Sean A. Irvine
 */
public class A026279 extends SumBetweenSequence {

  /** Construct the sequence. */
  public A026279() {
    super(new A026276());
  }
}
