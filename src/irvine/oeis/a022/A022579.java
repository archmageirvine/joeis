package irvine.oeis.a022;

import irvine.oeis.EulerTransformSequence;
import irvine.oeis.PeriodicSequence;

/**
 * A022579 Expansion of <code>Product_{m&gt;=1} (1+x^m)^14</code>.
 * @author Sean A. Irvine
 */
public class A022579 extends EulerTransformSequence {

  /** Construct the sequence. */
  public A022579() {
    super(new PeriodicSequence(14, 0), 0);
  }
}

