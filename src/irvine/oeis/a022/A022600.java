package irvine.oeis.a022;

import irvine.oeis.EulerTransformSequence;
import irvine.oeis.PeriodicSequence;

/**
 * A022600 Expansion of Product_{m&gt;=1} (1+q^m)^(-5).
 * @author Sean A. Irvine
 */
public class A022600 extends EulerTransformSequence {

  /** Construct the sequence. */
  public A022600() {
    super(new PeriodicSequence(-5, 0), 0);
  }
}

