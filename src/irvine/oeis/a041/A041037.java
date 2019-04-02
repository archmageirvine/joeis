package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041037 Denominators of continued fraction convergents to sqrt(23).
 * @author Sean A. Irvine
 */
public class A041037 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041037() {
    super(new long[] {-1, 0, 0, 0, 48, 0, 0, 0}, new long[] {1, 1, 4, 5, 44, 49, 191, 240});
  }
}
