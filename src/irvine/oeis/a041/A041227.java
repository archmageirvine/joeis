package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041227 Denominators of continued fraction convergents to sqrt(125).
 * @author Sean A. Irvine
 */
public class A041227 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041227() {
    super(new long[] {1, 0, 0, 0, 0, 1364, 0, 0, 0, 0}, new long[] {1, 5, 6, 11, 61, 1353, 6826, 8179, 15005, 83204});
  }
}
