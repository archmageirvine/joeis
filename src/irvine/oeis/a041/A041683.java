package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041683 Denominators of continued fraction convergents to sqrt(360).
 * @author Sean A. Irvine
 */
public class A041683 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041683() {
    super(new long[] {-1, 0, 38, 0}, new long[] {1, 1, 37, 38});
  }
}
