package irvine.oeis.a005;

import irvine.oeis.DikTransformSequence;
import irvine.oeis.a054.A054977;

/**
 * A005595 States of a dynamic storage system.
 * @author Sean A. Irvine
 */
public class A005595 extends DikTransformSequence {

  /** Construct the sequence. */
  public A005595() {
    super(new A054977(), 0);
  }
}

