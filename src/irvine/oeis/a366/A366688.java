package irvine.oeis.a366;

import irvine.factor.factor.Jaguar;
import irvine.oeis.a034.A034524;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A366688 Number of divisors of 11^n+1.
 * @author Sean A. Irvine
 */
public class A366688 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A366688() {
    super(0, new A034524(), k -> Jaguar.factor(k).sigma0());
  }
}

