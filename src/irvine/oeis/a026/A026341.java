package irvine.oeis.a026;

import irvine.oeis.SumBetweenSequence;

/**
 * A026341 <code>a(n) =</code> sum of the numbers between the two n's in <code>A026338</code>.
 * @author Sean A. Irvine
 */
public class A026341 extends SumBetweenSequence {

  /** Construct the sequence. */
  public A026341() {
    super(new A026338());
  }
}
