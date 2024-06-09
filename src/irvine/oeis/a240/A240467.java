package irvine.oeis.a240;

import irvine.math.cyclotomic.CyclotomicPolynomials;
import irvine.oeis.recur.PeriodicSequence;

/**
 * A240467 Inverse of 152nd cyclotomic polynomial.
 * @author Sean A. Irvine
 */
public class A240467 extends PeriodicSequence {

  /** Construct the sequence. */
  public A240467() {
    super(CyclotomicPolynomials.inverse(152));
  }
}
