package irvine.oeis.a022;

import irvine.oeis.EulerTransformSequence;
import irvine.oeis.PeriodicSequence;

/**
 * A022627 Expansion of Product_{m&gt;=1} (1+q^m)^(-32).
 * @author Sean A. Irvine
 */
public class A022627 extends EulerTransformSequence {

  /** Construct the sequence. */
  public A022627() {
    super(new PeriodicSequence(-32, 0), 0);
  }
}

