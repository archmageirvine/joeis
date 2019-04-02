package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041082 Numerators of continued fraction convergents to sqrt(48).
 * @author Sean A. Irvine
 */
public class A041082 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041082() {
    super(new long[] {-1, 0, 14, 0}, new long[] {6, 7, 90, 97});
  }
}
