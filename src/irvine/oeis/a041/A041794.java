package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041794 Numerators of continued fraction convergents to sqrt(418).
 * @author Sean A. Irvine
 */
public class A041794 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041794() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 67714, 0, 0, 0, 0, 0}, new long[] {20, 41, 184, 3721, 15068, 33857, 1369348, 2772553, 12459560, 251963753, 1020314572, 2292592897L});
  }
}
