package irvine.oeis.a022;

import irvine.oeis.EulerTransformSequence;
import irvine.oeis.PeriodicSequence;

/**
 * A022624 Expansion of <code>Product_{m&gt;=1} (1+q^m)^(-29)</code>.
 * @author Sean A. Irvine
 */
public class A022624 extends EulerTransformSequence {

  /** Construct the sequence. */
  public A022624() {
    super(new PeriodicSequence(-29, 0), 0);
  }
}

