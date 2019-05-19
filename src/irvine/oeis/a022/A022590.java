package irvine.oeis.a022;

import irvine.oeis.EulerTransformSequence;
import irvine.oeis.PeriodicSequence;

/**
 * A022590 Expansion of <code>Product_{m&gt;=1} (1+q^m)^26</code>.
 * @author Sean A. Irvine
 */
public class A022590 extends EulerTransformSequence {

  /** Construct the sequence. */
  public A022590() {
    super(new PeriodicSequence(26, 0), 0);
  }
}

