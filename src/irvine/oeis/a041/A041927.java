package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041927 Denominators of continued fraction convergents to sqrt(486).
 * @author Sean A. Irvine
 */
public class A041927 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041927() {
    super(new long[] {-1, 0, 970, 0}, new long[] {1, 22, 969, 21340});
  }
}
