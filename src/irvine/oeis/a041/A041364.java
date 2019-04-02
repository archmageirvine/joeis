package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041364 Numerators of continued fraction convergents to sqrt(197).
 * @author Sean A. Irvine
 */
public class A041364 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041364() {
    super(new long[] {1, 28}, new long[] {14, 393});
  }
}
