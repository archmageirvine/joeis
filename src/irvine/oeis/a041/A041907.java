package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041907 Denominators of continued fraction convergents to <code>sqrt(475)</code>.
 * @author Sean A. Irvine
 */
public class A041907 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041907() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 115598, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 1, 4, 5, 34, 73, 472, 545, 2107, 2652, 113491, 116143, 461920, 578063, 3930298, 8438659, 54562252, 63000911, 243564985, 306565896});
  }
}
