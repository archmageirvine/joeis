package irvine.oeis.a022;

import irvine.oeis.EulerTransformSequence;
import irvine.oeis.PeriodicSequence;

/**
 * A022602 Expansion of <code>Product_{m&gt;=1} (1+q^m)^(-7)</code>.
 * @author Sean A. Irvine
 */
public class A022602 extends EulerTransformSequence {

  /** Construct the sequence. */
  public A022602() {
    super(new PeriodicSequence(-7, 0), 0);
  }
}

