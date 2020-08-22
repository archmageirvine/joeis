package irvine.oeis.a022;

import irvine.oeis.EulerTransformSequence;
import irvine.oeis.PeriodicSequence;

/**
 * A022625 Expansion of Product_{m&gt;=1} (1+q^m)^(-30).
 * @author Sean A. Irvine
 */
public class A022625 extends EulerTransformSequence {

  /** Construct the sequence. */
  public A022625() {
    super(new PeriodicSequence(-30, 0), 0);
  }
}

