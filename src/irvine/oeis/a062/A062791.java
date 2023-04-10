package irvine.oeis.a062;

import irvine.oeis.a001.A001405;
import irvine.oeis.transform.MobiusTransformSequence;

/**
 * A062791 Moebius transform of central binomial coefficients.
 * @author Sean A. Irvine
 */
public class A062791 extends MobiusTransformSequence {

  /** Construct the sequence. */
  public A062791() {
    super(new A001405(), 1);
    next();
  }
}
