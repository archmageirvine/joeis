package irvine.oeis.a064;

import irvine.oeis.DistinctSequence;
import irvine.oeis.a025.A025543;

/**
 * A064354 Distinct values arising in the sequence of the least common multiples of the first n composite numbers.
 * @author Sean A. Irvine
 */
public class A064354 extends DistinctSequence {

  /** Construct the sequence. */
  public A064354() {
    super(1, new A025543());
  }
}
