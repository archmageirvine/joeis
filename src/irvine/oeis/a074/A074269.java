package irvine.oeis.a074;

import irvine.oeis.a072.A072508;
import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A001599.
 * @author Sean A. Irvine
 */
public class A074269 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A074269() {
    super(0, new A072508());
  }
}
