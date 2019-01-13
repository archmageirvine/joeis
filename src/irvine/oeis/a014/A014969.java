package irvine.oeis.a014;

import irvine.oeis.EulerTransformSequence;
import irvine.oeis.PeriodicSequence;

/**
 * A014969.
 * @author Sean A. Irvine
 */
public class A014969 extends EulerTransformSequence {

  /** Construct the sequence. */
  public A014969() {
    super(new PeriodicSequence(8, -4, 8, 0), 0);
  }
}
