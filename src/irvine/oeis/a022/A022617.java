package irvine.oeis.a022;

import irvine.oeis.EulerTransformSequence;
import irvine.oeis.PeriodicSequence;

/**
 * A022617 Expansion of Product_{m&gt;=1} (1+q^m)^(-22).
 * @author Sean A. Irvine
 */
public class A022617 extends EulerTransformSequence {

  /** Construct the sequence. */
  public A022617() {
    super(new PeriodicSequence(-22, 0), 0);
  }
}

