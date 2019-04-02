package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041498 Numerators of continued fraction convergents to sqrt(266).
 * @author Sean A. Irvine
 */
public class A041498 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041498() {
    super(new long[] {-1, 0, 0, 0, 1370, 0, 0, 0}, new long[] {16, 49, 212, 685, 22132, 67081, 290456, 938449});
  }
}
