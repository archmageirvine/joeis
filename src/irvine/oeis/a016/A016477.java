package irvine.oeis.a016;

import irvine.oeis.ContinuedFractionSequence;

/**
 * A016477 Continued fraction for log(49).
 * @author Sean A. Irvine
 */
public class A016477 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016477() {
    super(new A016672());
  }
}
