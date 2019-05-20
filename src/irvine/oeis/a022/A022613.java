package irvine.oeis.a022;

import irvine.oeis.EulerTransformSequence;
import irvine.oeis.PeriodicSequence;

/**
 * A022613 Expansion of <code>Product_{m&gt;=1} (1+q^m)^(-18)</code>.
 * @author Sean A. Irvine
 */
public class A022613 extends EulerTransformSequence {

  /** Construct the sequence. */
  public A022613() {
    super(new PeriodicSequence(-18, 0), 0);
  }
}

