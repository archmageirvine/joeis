package irvine.oeis.a026;

import irvine.oeis.SumBetweenSequence;

/**
 * A026345 a(n) = sum of the numbers between the two n's in A026342.
 * @author Sean A. Irvine
 */
public class A026345 extends SumBetweenSequence {

  /** Construct the sequence. */
  public A026345() {
    super(new A026342());
  }
}
