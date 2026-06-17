package irvine.oeis.a085;

import irvine.oeis.a014.A014571;
import irvine.oeis.cons.ContinuedFractionNumeratorSequence;

/**
 * A085394 Numerators of convergents to Thue-Morse constant.
 * @author Sean A. Irvine
 */
public class A085394 extends ContinuedFractionNumeratorSequence {

  /** Construct the sequence. */
  public A085394() {
    super(1, new A014571());
  }
}
