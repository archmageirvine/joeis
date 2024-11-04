package irvine.oeis.a377;

import irvine.math.function.Functions;
import irvine.oeis.a061.A061190;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A377671.
 * @author Sean A. Irvine
 */
public class A377676 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A377676() {
    super(2, new A061190().skip(2), Functions.SIGMA0::z);
  }
}
