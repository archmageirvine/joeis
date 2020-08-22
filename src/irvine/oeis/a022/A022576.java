package irvine.oeis.a022;

import irvine.oeis.EulerTransformSequence;
import irvine.oeis.PeriodicSequence;

/**
 * A022576 Expansion of Product_{m&gt;=1} (1+x^m)^11.
 * @author Sean A. Irvine
 */
public class A022576 extends EulerTransformSequence {

  /** Construct the sequence. */
  public A022576() {
    super(new PeriodicSequence(11, 0), 0);
  }
}

