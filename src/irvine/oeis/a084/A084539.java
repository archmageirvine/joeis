
package irvine.oeis.a084;

import irvine.oeis.cons.ContinuedFractionSequence;

/**
 * A086993.
 * @author Sean A. Irvine
 */
public class A084539 extends ContinuedFractionSequence {

  /** Construct the sequence. */
  public A084539() {
    super(0, new A084448());
  }
}
