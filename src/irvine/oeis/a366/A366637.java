package irvine.oeis.a366;

import irvine.factor.factor.Jaguar;
import irvine.oeis.a034.A034491;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A366637 Number of divisors of 7^n+1.
 * @author Sean A. Irvine
 */
public class A366637 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A366637() {
    super(0, new A034491(), k -> Jaguar.factor(k).sigma0());
  }
}

