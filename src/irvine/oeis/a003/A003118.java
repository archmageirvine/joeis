package irvine.oeis.a003;

import irvine.oeis.cons.ContinuedFractionSequence;
import irvine.oeis.a005.A005533;

/**
 * A003118 Continued fraction for fifth root of 4.
 * @author Sean A. Irvine
 */
public class A003118 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A003118() {
    super(new A005533());
  }
}
