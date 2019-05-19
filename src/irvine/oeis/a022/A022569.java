package irvine.oeis.a022;

import irvine.oeis.EulerTransformSequence;
import irvine.oeis.PeriodicSequence;

/**
 * A022569 Expansion of <code>Product_{m&gt;=1} (1+x^m)^4</code>.
 * @author Sean A. Irvine
 */
public class A022569 extends EulerTransformSequence {

  /** Construct the sequence. */
  public A022569() {
    super(new PeriodicSequence(4, 0), 0);
  }
}

