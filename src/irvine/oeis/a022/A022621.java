package irvine.oeis.a022;

import irvine.oeis.EulerTransformSequence;
import irvine.oeis.PeriodicSequence;

/**
 * A022621 Expansion of Product_{m&gt;=1} (1+q^m)^(-26).
 * @author Sean A. Irvine
 */
public class A022621 extends EulerTransformSequence {

  /** Construct the sequence. */
  public A022621() {
    super(new PeriodicSequence(-26, 0), 0);
  }
}

