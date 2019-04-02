package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041601 Denominators of continued fraction convergents to sqrt(318).
 * @author Sean A. Irvine
 */
public class A041601 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041601() {
    super(new long[] {-1, 0, 0, 0, 214, 0, 0, 0}, new long[] {1, 1, 5, 6, 209, 215, 1069, 1284});
  }
}
