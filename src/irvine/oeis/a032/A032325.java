package irvine.oeis.a032;

import irvine.oeis.transform.ChjTransformSequence;
import irvine.oeis.a000.A000012;

/**
 * A032325 Number of ways to partition n labeled elements into pie slices forming an aperiodic pattern.
 * @author Sean A. Irvine
 */
public class A032325 extends ChjTransformSequence {

  /** Construct the sequence. */
  public A032325() {
    super(new A000012());
  }
}
