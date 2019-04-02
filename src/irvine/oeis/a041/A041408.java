package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041408 Numerators of continued fraction convergents to sqrt(219).
 * @author Sean A. Irvine
 */
public class A041408 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041408() {
    super(new long[] {-1, 0, 0, 0, 148, 0, 0, 0}, new long[] {14, 15, 59, 74, 2131, 2205, 8746, 10951});
  }
}
