package irvine.oeis.a366;

import irvine.factor.factor.Jaguar;
import irvine.oeis.a062.A062395;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A366657 Sum of the divisors of 8^n+1.
 * @author Sean A. Irvine
 */
public class A366657 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A366657() {
    super(0, new A062395(), k -> Jaguar.factor(k).sigma());
  }
}

