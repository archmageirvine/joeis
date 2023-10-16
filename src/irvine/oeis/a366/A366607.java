package irvine.oeis.a366;

import irvine.factor.factor.Jaguar;
import irvine.oeis.a052.A052539;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A366607 Sum of the divisors of 4^n+1.
 * @author Sean A. Irvine
 */
public class A366607 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A366607() {
    super(0, new A052539(), k -> Jaguar.factor(k).sigma());
  }
}

