package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041464 Numerators of continued fraction convergents to sqrt(248).
 * @author Sean A. Irvine
 */
public class A041464 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041464() {
    super(new long[] {-1, 0, 0, 0, 126, 0, 0, 0}, new long[] {15, 16, 47, 63, 1937, 2000, 5937, 7937});
  }
}
