package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041280 Numerators of continued fraction convergents to sqrt(153).
 * @author Sean A. Irvine
 */
public class A041280 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041280() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 4354, 0, 0, 0, 0, 0, 0, 0}, new long[] {12, 25, 37, 99, 235, 569, 804, 2177, 53052, 108281, 161333, 430947, 1023227, 2477401, 3500628, 9478657});
  }
}
