
package irvine.oeis.a084;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A084539 Continued fraction expansion of (negative of) Kinkelin constant.
 * @author Sean A. Irvine
 */
public class A084539 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A084539() {
    super(0, new A084448());
  }
}
