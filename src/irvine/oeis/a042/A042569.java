package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042569 Denominators of continued fraction convergents to sqrt(813).
 * @author Sean A. Irvine
 */
public class A042569 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042569() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 4334, 0, 0, 0, 0, 0}, new long[] {1, 1, 2, 37, 39, 76, 4295, 4371, 8666, 160359, 169025, 329384});
  }
}
