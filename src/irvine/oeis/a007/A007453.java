package irvine.oeis.a007;

import irvine.oeis.InverseEulerTransformSequence;
import irvine.oeis.a003.A003430;

/**
 * A007453.
 * @author Sean A. Irvine
 */
public class A007453 extends InverseEulerTransformSequence {

  /** Construct the sequence. */
  public A007453() {
    super(new A003430(), 0);
    next();
  }
}

