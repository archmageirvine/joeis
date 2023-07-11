package irvine.oeis.a005;

import irvine.oeis.a054.A054977;
import irvine.oeis.transform.CycleTransformSequence;

/**
 * A005594 States of a dynamic storage system.
 * @author Sean A. Irvine
 */
public class A005594 extends CycleTransformSequence {

  /** Construct the sequence. */
  public A005594() {
    super(0, new A054977(), 0);
  }
}

