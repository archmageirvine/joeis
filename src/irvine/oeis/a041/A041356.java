package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041356 Numerators of continued fraction convergents to sqrt(192).
 * @author Sean A. Irvine
 */
public class A041356 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041356() {
    super(new long[] {-1, 0, 0, 0, 194, 0, 0, 0}, new long[] {13, 14, 83, 97, 2605, 2702, 16115, 18817});
  }
}
