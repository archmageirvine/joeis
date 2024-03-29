package irvine.oeis.a366;

import irvine.factor.factor.Jaguar;
import irvine.oeis.a062.A062394;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A366629 Sum of the divisors of 6^n+1.
 * @author Sean A. Irvine
 */
public class A366629 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A366629() {
    super(0, new A062394(), k -> Jaguar.factor(k).sigma());
  }
}

