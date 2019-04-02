package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041739 Denominators of continued fraction convergents to sqrt(389).
 * @author Sean A. Irvine
 */
public class A041739 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041739() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0, 2564, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 1, 3, 4, 7, 11, 18, 47, 65, 2517, 2582, 7681, 10263, 17944, 28207, 46151, 120509, 166660});
  }
}
