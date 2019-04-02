package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042029 Denominators of continued fraction convergents to sqrt(538).
 * @author Sean A. Irvine
 */
public class A042029 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042029() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 138102, 0, 0, 0, 0, 0, 0}, new long[] {1, 5, 36, 41, 77, 580, 2977, 137522, 690587, 4971631, 5662218, 10633849, 80099161, 411129654});
  }
}
