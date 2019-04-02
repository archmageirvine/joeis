package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041414 Numerators of continued fraction convergents to sqrt(222).
 * @author Sean A. Irvine
 */
public class A041414 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041414() {
    super(new long[] {-1, 0, 0, 0, 298, 0, 0, 0}, new long[] {14, 15, 134, 149, 4306, 4455, 39946, 44401});
  }
}
