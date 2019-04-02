package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041089 Denominators of continued fraction convergents to sqrt(52).
 * @author Sean A. Irvine
 */
public class A041089 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041089() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 1298, 0, 0, 0, 0, 0}, new long[] {1, 4, 5, 14, 19, 90, 1279, 5206, 6485, 18176, 24661, 116820});
  }
}
