package irvine.oeis.a366;

import irvine.factor.factor.Jaguar;
import irvine.oeis.a062.A062394;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A366628 Number of divisors of 6^n+1.
 * @author Sean A. Irvine
 */
public class A366628 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A366628() {
    super(0, new A062394(), k -> Jaguar.factor(k).sigma0());
  }
}

