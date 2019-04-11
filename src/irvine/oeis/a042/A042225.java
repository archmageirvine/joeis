package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042225 Denominators of continued fraction convergents to <code>sqrt(638)</code>.
 * @author Sean A. Irvine
 */
public class A042225 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042225() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 84566, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 3, 4, 27, 58, 375, 433, 1674, 84133, 254073, 338206, 2283309, 4904824, 31712253, 36617077, 141563484});
  }
}
