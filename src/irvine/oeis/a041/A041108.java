package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041108 Numerators of continued fraction convergents to sqrt(62).
 * @author Sean A. Irvine
 */
public class A041108 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041108() {
    super(new long[] {-1, 0, 0, 0, 126, 0, 0, 0}, new long[] {7, 8, 55, 63, 937, 1000, 6937, 7937});
  }
}
