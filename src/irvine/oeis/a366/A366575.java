package irvine.oeis.a366;

import irvine.factor.factor.Jaguar;
import irvine.oeis.a024.A024023;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A366575 Number of divisors of 3^n - 1.
 * @author Sean A. Irvine
 */
public class A366575 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A366575() {
    super(1, new A024023().skip(), k -> Jaguar.factor(k).sigma0());
  }
}

