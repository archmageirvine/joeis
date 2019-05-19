package irvine.oeis.a022;

import irvine.oeis.EulerTransformSequence;
import irvine.oeis.PeriodicSequence;

/**
 * A022584 Expansion of <code>Product_{m&gt;=1} (1+x^m)^19</code>.
 * @author Sean A. Irvine
 */
public class A022584 extends EulerTransformSequence {

  /** Construct the sequence. */
  public A022584() {
    super(new PeriodicSequence(19, 0), 0);
  }
}

