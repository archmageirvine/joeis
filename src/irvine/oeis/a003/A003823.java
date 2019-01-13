package irvine.oeis.a003;

import irvine.oeis.EulerTransformSequence;
import irvine.oeis.PeriodicSequence;

/**
 * A003823.
 * @author Sean A. Irvine
 */
public class A003823 extends EulerTransformSequence {

  /** Construct the sequence. */
  public A003823() {
    super(new PeriodicSequence(1, -1, -1, 1, 0), 0);
  }
}
