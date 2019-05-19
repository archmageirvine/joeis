package irvine.oeis.a022;

import irvine.oeis.EulerTransformSequence;
import irvine.oeis.PeriodicSequence;

/**
 * A022580 Expansion of <code>Product_{m&gt;=1} (1+x^m)^15</code>.
 * @author Sean A. Irvine
 */
public class A022580 extends EulerTransformSequence {

  /** Construct the sequence. */
  public A022580() {
    super(new PeriodicSequence(15, 0), 0);
  }
}

