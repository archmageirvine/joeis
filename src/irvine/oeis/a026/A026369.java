package irvine.oeis.a026;

import irvine.oeis.SumBetweenSequence;

/**
 * A026369 <code>a(n) =</code> sum of the numbers between the two n's in <code>A026366</code>.
 * @author Sean A. Irvine
 */
public class A026369 extends SumBetweenSequence {

  /** Construct the sequence. */
  public A026369() {
    super(new A026366(), 2);
  }
}
