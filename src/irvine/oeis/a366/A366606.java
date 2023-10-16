package irvine.oeis.a366;

import irvine.factor.factor.Jaguar;
import irvine.oeis.a052.A052539;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A366606 Number of divisors of 4^n+1.
 * @author Sean A. Irvine
 */
public class A366606 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A366606() {
    super(0, new A052539(), k -> Jaguar.factor(k).sigma0());
  }
}

