package irvine.oeis.a057;

import irvine.oeis.DistinctSequence;

/**
 * A057961 Number of points in square lattice covered by a disc centered at (0,0) as its radius increases.
 * @author Sean A. Irvine
 */
public class A057961 extends DistinctSequence {

  /** Construct the sequence. */
  public A057961() {
    super(new A057655());
  }
}
