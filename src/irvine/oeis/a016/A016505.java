package irvine.oeis.a016;

import irvine.oeis.ContinuedFractionSequence;

/**
 * A016505 Continued fraction for <code>log(77)</code>.
 * @author Sean A. Irvine
 */
public class A016505 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016505() {
    super(new A016700());
  }
}
