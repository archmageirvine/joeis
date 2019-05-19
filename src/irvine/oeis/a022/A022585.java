package irvine.oeis.a022;

import irvine.oeis.EulerTransformSequence;
import irvine.oeis.PeriodicSequence;

/**
 * A022585 Expansion of <code>Product_{m&gt;=1} (1+x^m)^20</code>.
 * @author Sean A. Irvine
 */
public class A022585 extends EulerTransformSequence {

  /** Construct the sequence. */
  public A022585() {
    super(new PeriodicSequence(20, 0), 0);
  }
}

