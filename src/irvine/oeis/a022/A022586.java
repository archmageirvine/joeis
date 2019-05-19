package irvine.oeis.a022;

import irvine.oeis.EulerTransformSequence;
import irvine.oeis.PeriodicSequence;

/**
 * A022586 Expansion of <code>Product_{m&gt;=1} (1+x^m)^21</code>.
 * @author Sean A. Irvine
 */
public class A022586 extends EulerTransformSequence {

  /** Construct the sequence. */
  public A022586() {
    super(new PeriodicSequence(21, 0), 0);
  }
}

