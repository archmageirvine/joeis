package irvine.oeis.a022;

import irvine.oeis.EulerTransformSequence;
import irvine.oeis.PeriodicSequence;

/**
 * A022568 Expansion of <code>Product_{m&gt;=1} (1+x^m)^3</code>.
 * @author Sean A. Irvine
 */
public class A022568 extends EulerTransformSequence {

  /** Construct the sequence. */
  public A022568() {
    super(new PeriodicSequence(3, 0), 0);
  }
}

