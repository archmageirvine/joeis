package irvine.oeis.a016;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A016505 Continued fraction for log(77).
 * @author Sean A. Irvine
 */
public class A016505 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016505() {
    super(new A016700());
  }
}
