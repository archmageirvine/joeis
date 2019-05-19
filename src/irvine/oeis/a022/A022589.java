package irvine.oeis.a022;

import irvine.oeis.EulerTransformSequence;
import irvine.oeis.PeriodicSequence;

/**
 * A022589 Expansion of <code>Product_{m&gt;=1} (1 + q^m)^25</code>.
 * @author Sean A. Irvine
 */
public class A022589 extends EulerTransformSequence {

  /** Construct the sequence. */
  public A022589() {
    super(new PeriodicSequence(25, 0), 0);
  }
}

