package irvine.oeis.a366;

import irvine.factor.factor.Jaguar;
import irvine.oeis.a178.A178248;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A366714 Number of divisors of 12^n+1.
 * @author Sean A. Irvine
 */
public class A366714 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A366714() {
    super(0, new A178248(), k -> Jaguar.factor(k).sigma0());
  }
}

