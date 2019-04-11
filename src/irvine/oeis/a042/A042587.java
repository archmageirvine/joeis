package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042587 Denominators of continued fraction convergents to <code>sqrt(822)</code>.
 * @author Sean A. Irvine
 */
public class A042587 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042587() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 14794, 0, 0, 0, 0, 0}, new long[] {1, 1, 3, 85, 173, 258, 14621, 14879, 44379, 1257491, 2559361, 3816852});
  }
}
