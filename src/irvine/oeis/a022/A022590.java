package irvine.oeis.a022;

import irvine.oeis.EulerTransformSequence;
import irvine.oeis.PeriodicSequence;

/**
 * A022590.
 * @author Sean A. Irvine
 */
public class A022590 extends EulerTransformSequence {

  /** Construct the sequence. */
  public A022590() {
    super(new PeriodicSequence(26, 0), 0);
  }
}

