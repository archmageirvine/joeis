package irvine.oeis.a026;

import irvine.oeis.SumBetweenSequence;

/**
 * A026345 <code>a(n) =</code> sum of the numbers between the two n's in <code>A026342</code>.
 * @author Sean A. Irvine
 */
public class A026345 extends SumBetweenSequence {

  /** Construct the sequence. */
  public A026345() {
    super(new A026342());
  }
}
