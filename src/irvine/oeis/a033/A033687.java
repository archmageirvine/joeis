package irvine.oeis.a033;

import irvine.oeis.EulerTransformSequence;
import irvine.oeis.PeriodicSequence;

/**
 * A033687 Theta series of hexagonal lattice <code>A_2</code> with respect to deep hole divided by 3.
 * @author Sean A. Irvine
 */
public class A033687 extends EulerTransformSequence {

  /** Construct the sequence. */
  public A033687() {
    super(new PeriodicSequence(1, 1, -2), 0);
  }
}

