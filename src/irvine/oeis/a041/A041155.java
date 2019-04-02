package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041155 Denominators of continued fraction convergents to sqrt(87).
 * @author Sean A. Irvine
 */
public class A041155 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041155() {
    super(new long[] {-1, 0, 56, 0}, new long[] {1, 3, 55, 168});
  }
}
