package irvine.oeis.a022;

import irvine.oeis.EulerTransformSequence;
import irvine.oeis.PeriodicSequence;

/**
 * A022573 Expansion of <code>Product_{m&gt;=1} (1+x^m)^8</code>.
 * @author Sean A. Irvine
 */
public class A022573 extends EulerTransformSequence {

  /** Construct the sequence. */
  public A022573() {
    super(new PeriodicSequence(8, 0), 0);
  }
}

