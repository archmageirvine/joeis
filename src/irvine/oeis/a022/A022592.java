package irvine.oeis.a022;

import irvine.oeis.EulerTransformSequence;
import irvine.oeis.PeriodicSequence;

/**
 * A022592 Expansion of <code>Product_{m&gt;=1} (1+q^m)^28</code>.
 * @author Sean A. Irvine
 */
public class A022592 extends EulerTransformSequence {

  /** Construct the sequence. */
  public A022592() {
    super(new PeriodicSequence(28, 0), 0);
  }
}

