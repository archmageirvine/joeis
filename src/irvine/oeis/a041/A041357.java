package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041357 Denominators of continued fraction convergents to sqrt(192).
 * @author Sean A. Irvine
 */
public class A041357 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041357() {
    super(new long[] {-1, 0, 0, 0, 194, 0, 0, 0}, new long[] {1, 1, 6, 7, 188, 195, 1163, 1358});
  }
}
