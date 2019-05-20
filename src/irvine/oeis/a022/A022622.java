package irvine.oeis.a022;

import irvine.oeis.EulerTransformSequence;
import irvine.oeis.PeriodicSequence;

/**
 * A022622 Expansion of <code>Product_{m&gt;=1} (1+q^m)^(-27)</code>.
 * @author Sean A. Irvine
 */
public class A022622 extends EulerTransformSequence {

  /** Construct the sequence. */
  public A022622() {
    super(new PeriodicSequence(-27, 0), 0);
  }
}

