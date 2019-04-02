package irvine.oeis.a015;

import irvine.oeis.EulerTransformSequence;
import irvine.oeis.PeriodicSequence;

/**
 * A015128 Number of overpartitions of n: an overpartition of n is an ordered sequence of nonincreasing integers that sum to n, where the first occurrence of each integer may be overlined.
 * @author Sean A. Irvine
 */
public class A015128 extends EulerTransformSequence {

  /** Construct the sequence. */
  public A015128() {
    super(new PeriodicSequence(2, 1), 0);
  }
}
