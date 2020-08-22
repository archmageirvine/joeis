package irvine.oeis.a022;

import irvine.oeis.EulerTransformSequence;
import irvine.oeis.PeriodicSequence;

/**
 * A022612 Expansion of Product_{m&gt;=1} (1+q^m)^(-17).
 * @author Sean A. Irvine
 */
public class A022612 extends EulerTransformSequence {

  /** Construct the sequence. */
  public A022612() {
    super(new PeriodicSequence(-17, 0), 0);
  }
}

