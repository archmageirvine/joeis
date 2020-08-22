package irvine.oeis.a022;

import irvine.oeis.EulerTransformSequence;
import irvine.oeis.PeriodicSequence;

/**
 * A022609 Expansion of Product_{m&gt;=1} (1+q^m)^(-14).
 * @author Sean A. Irvine
 */
public class A022609 extends EulerTransformSequence {

  /** Construct the sequence. */
  public A022609() {
    super(new PeriodicSequence(-14, 0), 0);
  }
}

