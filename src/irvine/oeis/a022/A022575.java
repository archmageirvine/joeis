package irvine.oeis.a022;

import irvine.oeis.EulerTransformSequence;
import irvine.oeis.PeriodicSequence;

/**
 * A022575 Expansion of <code>Product_{m&gt;=1} (1+x^m)^10</code>.
 * @author Sean A. Irvine
 */
public class A022575 extends EulerTransformSequence {

  /** Construct the sequence. */
  public A022575() {
    super(new PeriodicSequence(10, 0), 0);
  }
}

