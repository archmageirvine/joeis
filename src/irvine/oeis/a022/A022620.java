package irvine.oeis.a022;

import irvine.oeis.EulerTransformSequence;
import irvine.oeis.PeriodicSequence;

/**
 * A022620 Expansion of <code>Product_{m&gt;=1} (1+q^m)^(-25)</code>.
 * @author Sean A. Irvine
 */
public class A022620 extends EulerTransformSequence {

  /** Construct the sequence. */
  public A022620() {
    super(new PeriodicSequence(-25, 0), 0);
  }
}

