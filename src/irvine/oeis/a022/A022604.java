package irvine.oeis.a022;

import irvine.oeis.EulerTransformSequence;
import irvine.oeis.PeriodicSequence;

/**
 * A022604 Expansion of Product_{m&gt;=1} (1+q^m)^(-9).
 * @author Sean A. Irvine
 */
public class A022604 extends EulerTransformSequence {

  /** Construct the sequence. */
  public A022604() {
    super(new PeriodicSequence(-9, 0), 0);
  }
}

