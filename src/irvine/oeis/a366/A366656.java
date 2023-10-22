package irvine.oeis.a366;

import irvine.factor.factor.Jaguar;
import irvine.oeis.a062.A062395;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A366656 Number of divisors of 8^n+1.
 * @author Sean A. Irvine
 */
public class A366656 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A366656() {
    super(0, new A062395(), k -> Jaguar.factor(k).sigma0());
  }
}

