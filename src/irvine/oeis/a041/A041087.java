package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041087 Denominators of continued fraction convergents to sqrt(51).
 * @author Sean A. Irvine
 */
public class A041087 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041087() {
    super(new long[] {-1, 0, 100, 0}, new long[] {1, 7, 99, 700});
  }
}
