package irvine.oeis.a032;

import irvine.oeis.transform.ChjTransformSequence;
import irvine.oeis.a057.A057427;

/**
 * A032327 Number of ways to partition n labeled elements into pie slices of size at least 2 forming an aperiodic pattern.
 * @author Sean A. Irvine
 */
public class A032327 extends ChjTransformSequence {

  /** Construct the sequence. */
  public A032327() {
    super(new A057427());
  }
}
