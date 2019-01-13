package irvine.oeis.a015;

import irvine.oeis.EulerTransformSequence;
import irvine.oeis.PeriodicSequence;

/**
 * A015128.
 * @author Sean A. Irvine
 */
public class A015128 extends EulerTransformSequence {

  /** Construct the sequence. */
  public A015128() {
    super(new PeriodicSequence(2, 1), 0);
  }
}
