package irvine.oeis.a366;

import irvine.factor.factor.Jaguar;
import irvine.oeis.a034.A034474;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A366616 Number of divisors of 5^n+1.
 * @author Sean A. Irvine
 */
public class A366616 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A366616() {
    super(0, new A034474(), k -> Jaguar.factor(k).sigma0());
  }
}

