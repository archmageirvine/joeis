package irvine.oeis.a048;

import irvine.oeis.a005.A005596;
import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A048296 Continued fraction for Artin's constant.
 * @author Sean A. Irvine
 */
public class A048296 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A048296() {
    super(0, new A005596());
  }
}

