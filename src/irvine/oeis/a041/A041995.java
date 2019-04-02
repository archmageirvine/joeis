package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041995 Denominators of continued fraction convergents to sqrt(520).
 * @author Sean A. Irvine
 */
public class A041995 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041995() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 12998, 0, 0, 0, 0, 0}, new long[] {1, 1, 5, 56, 229, 285, 12769, 13054, 64985, 727889, 2976541, 3704430});
  }
}
