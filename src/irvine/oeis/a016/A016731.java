package irvine.oeis.a016;

import irvine.oeis.a002.A002391;
import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A016731 Continued fraction for log(3).
 * @author Sean A. Irvine
 */
public class A016731 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A016731() {
    super(new A002391());
  }
}
