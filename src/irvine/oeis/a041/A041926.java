package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041926 Numerators of continued fraction convergents to sqrt(486).
 * @author Sean A. Irvine
 */
public class A041926 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041926() {
    super(new long[] {-1, 0, 970, 0}, new long[] {22, 485, 21362, 470449});
  }
}
