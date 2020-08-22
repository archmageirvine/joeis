package irvine.oeis.a022;

import irvine.oeis.EulerTransformSequence;
import irvine.oeis.PeriodicSequence;

/**
 * A022623 Expansion of Product_{m&gt;=1} (1+q^m)^(-28).
 * @author Sean A. Irvine
 */
public class A022623 extends EulerTransformSequence {

  /** Construct the sequence. */
  public A022623() {
    super(new PeriodicSequence(-28, 0), 0);
  }
}

