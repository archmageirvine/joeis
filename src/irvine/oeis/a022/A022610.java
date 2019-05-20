package irvine.oeis.a022;

import irvine.oeis.EulerTransformSequence;
import irvine.oeis.PeriodicSequence;

/**
 * A022610 Expansion of <code>Product_{m&gt;=1} (1+q^m)^(-15)</code>.
 * @author Sean A. Irvine
 */
public class A022610 extends EulerTransformSequence {

  /** Construct the sequence. */
  public A022610() {
    super(new PeriodicSequence(-15, 0), 0);
  }
}

