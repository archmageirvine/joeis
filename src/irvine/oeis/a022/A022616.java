package irvine.oeis.a022;

import irvine.oeis.EulerTransformSequence;
import irvine.oeis.PeriodicSequence;

/**
 * A022616 Expansion of <code>Product_{m&gt;=1} (1+q^m)^(-21)</code>.
 * @author Sean A. Irvine
 */
public class A022616 extends EulerTransformSequence {

  /** Construct the sequence. */
  public A022616() {
    super(new PeriodicSequence(-21, 0), 0);
  }
}

