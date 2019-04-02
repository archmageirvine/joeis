package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041383 Denominators of continued fraction convergents to sqrt(206).
 * @author Sean A. Irvine
 */
public class A041383 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041383() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 119070, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 2, 3, 17, 241, 1222, 1463, 4148, 117607, 239362, 356969, 2024207, 28695867, 145503542, 174199409, 493902360});
  }
}
