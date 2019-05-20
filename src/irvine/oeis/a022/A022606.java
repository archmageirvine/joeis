package irvine.oeis.a022;

import irvine.oeis.EulerTransformSequence;
import irvine.oeis.PeriodicSequence;

/**
 * A022606 Expansion of <code>Product_{m&gt;=1} (1+q^m)^(-11)</code>.
 * @author Sean A. Irvine
 */
public class A022606 extends EulerTransformSequence {

  /** Construct the sequence. */
  public A022606() {
    super(new PeriodicSequence(-11, 0), 0);
  }
}

