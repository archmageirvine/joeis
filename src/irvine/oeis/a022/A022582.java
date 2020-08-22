package irvine.oeis.a022;

import irvine.oeis.EulerTransformSequence;
import irvine.oeis.PeriodicSequence;

/**
 * A022582 Expansion of Product_{m&gt;=1} (1+x^m)^17.
 * @author Sean A. Irvine
 */
public class A022582 extends EulerTransformSequence {

  /** Construct the sequence. */
  public A022582() {
    super(new PeriodicSequence(17, 0), 0);
  }
}

