package irvine.oeis.a022;

import irvine.oeis.EulerTransformSequence;
import irvine.oeis.PeriodicSequence;

/**
 * A022626 Expansion of Product_{m&gt;=1} (1+q^m)^(-31).
 * @author Sean A. Irvine
 */
public class A022626 extends EulerTransformSequence {

  /** Construct the sequence. */
  public A022626() {
    super(new PeriodicSequence(-31, 0), 0);
  }
}

