package irvine.oeis.a022;

import irvine.oeis.EulerTransformSequence;
import irvine.oeis.PeriodicSequence;

/**
 * A022611 Expansion of Product_{m&gt;=1} (1+q^m)^(-16).
 * @author Sean A. Irvine
 */
public class A022611 extends EulerTransformSequence {

  /** Construct the sequence. */
  public A022611() {
    super(new PeriodicSequence(-16, 0), 0);
  }
}

