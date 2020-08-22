package irvine.oeis.a022;

import irvine.oeis.EulerTransformSequence;
import irvine.oeis.PeriodicSequence;

/**
 * A022618 Expansion of Product_{m&gt;=1} (1+q^m)^(-23).
 * @author Sean A. Irvine
 */
public class A022618 extends EulerTransformSequence {

  /** Construct the sequence. */
  public A022618() {
    super(new PeriodicSequence(-23, 0), 0);
  }
}

