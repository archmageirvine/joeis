package irvine.oeis.a022;

import irvine.oeis.EulerTransformSequence;
import irvine.oeis.PeriodicSequence;

/**
 * A022578.
 * @author Sean A. Irvine
 */
public class A022578 extends EulerTransformSequence {

  /** Construct the sequence. */
  public A022578() {
    super(new PeriodicSequence(13, 0), 0);
  }
}

