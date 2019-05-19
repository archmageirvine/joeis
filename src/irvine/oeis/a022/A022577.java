package irvine.oeis.a022;

import irvine.oeis.EulerTransformSequence;
import irvine.oeis.PeriodicSequence;

/**
 * A022577 Expansion of <code>Product_{m&gt;=1} (1+x^m)^12</code>.
 * @author Sean A. Irvine
 */
public class A022577 extends EulerTransformSequence {

  /** Construct the sequence. */
  public A022577() {
    super(new PeriodicSequence(12, 0), 0);
  }
}

