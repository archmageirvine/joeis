package irvine.oeis.a394;

import irvine.oeis.DifferenceSequence;

/**
 * A394225 a(n) is the number of new, distinct point-like intersections created after the n-th step of the process described at A394915.
 * @author Sean A. Irvine
 */
public class A394225 extends DifferenceSequence {

  /** Construct the sequence. */
  public A394225() {
    super(1, new A394915().prepend(0));
  }
}
