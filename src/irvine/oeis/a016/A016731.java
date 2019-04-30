package irvine.oeis.a016;

import irvine.oeis.ContinuedFractionSequence;
import irvine.oeis.a002.A002391;

/**
 * A016731 Continued fraction for <code>log(3)</code>.
 * @author Sean A. Irvine
 */
public class A016731 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016731() {
    super(new A002391());
  }
}
