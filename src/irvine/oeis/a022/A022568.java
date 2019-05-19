package irvine.oeis.a022;

import irvine.oeis.EulerTransformSequence;
import irvine.oeis.PeriodicSequence;

/**
 * A022568.
 * @author Sean A. Irvine
 */
public class A022568 extends EulerTransformSequence {

  /** Construct the sequence. */
  public A022568() {
    super(new PeriodicSequence(3, 0), 0);
  }
}

