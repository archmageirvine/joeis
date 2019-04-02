package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041546 Numerators of continued fraction convergents to sqrt(291).
 * @author Sean A. Irvine
 */
public class A041546 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041546() {
    super(new long[] {-1, 0, 580, 0}, new long[] {17, 290, 9877, 168199});
  }
}
