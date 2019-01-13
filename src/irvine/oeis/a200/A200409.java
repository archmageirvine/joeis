package irvine.oeis.a200;

import irvine.oeis.LinearRecurrence;

/**
 * A200409.
 * @author Sean A. Irvine
 */
public class A200409 extends LinearRecurrence {

  /** Construct the sequence. */
  public A200409() {
    super(new long[] {-1, 0, 0, 340, 0, 0}, new long[] {1, 39, 571, 911, 13299, 194141});
  }
}
