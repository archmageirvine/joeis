package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042700 Numerators of continued fraction convergents to <code>sqrt(880)</code>.
 * @author Sean A. Irvine
 */
public class A042700 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042700() {
    super(new long[] {-1, 0, 0, 0, 178, 0, 0, 0}, new long[] {29, 30, 59, 89, 5221, 5310, 10531, 15841});
  }
}
