package irvine.oeis.a022;

import irvine.oeis.EulerTransformSequence;
import irvine.oeis.PeriodicSequence;

/**
 * A022596 Expansion of Product_{m&gt;=1} (1+q^m)^32.
 * @author Sean A. Irvine
 */
public class A022596 extends EulerTransformSequence {

  /** Construct the sequence. */
  public A022596() {
    super(new PeriodicSequence(32, 0), 0);
  }
}

