package irvine.oeis.a022;

import irvine.oeis.EulerTransformSequence;
import irvine.oeis.PeriodicSequence;

/**
 * A022570 Expansion of <code>Product_{m&gt;=1} (1+x^m)^5</code>.
 * @author Sean A. Irvine
 */
public class A022570 extends EulerTransformSequence {

  /** Construct the sequence. */
  public A022570() {
    super(new PeriodicSequence(5, 0), 0);
  }
}

