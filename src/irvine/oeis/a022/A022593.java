package irvine.oeis.a022;

import irvine.oeis.EulerTransformSequence;
import irvine.oeis.PeriodicSequence;

/**
 * A022593 Expansion of <code>Product_{m&gt;=1} (1+q^m)^29</code>.
 * @author Sean A. Irvine
 */
public class A022593 extends EulerTransformSequence {

  /** Construct the sequence. */
  public A022593() {
    super(new PeriodicSequence(29, 0), 0);
  }
}

