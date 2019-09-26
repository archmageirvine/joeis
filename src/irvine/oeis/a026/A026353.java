package irvine.oeis.a026;

import irvine.oeis.SumBetweenSequence;

/**
 * A026353 <code>a(n) =</code> sum of the numbers between the two n's in <code>A026350</code>.
 * @author Sean A. Irvine
 */
public class A026353 extends SumBetweenSequence {

  /** Construct the sequence. */
  public A026353() {
    super(new A026350(), 2);
  }
}
