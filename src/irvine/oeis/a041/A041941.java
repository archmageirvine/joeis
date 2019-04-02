package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041941 Denominators of continued fraction convergents to sqrt(493).
 * @author Sean A. Irvine
 */
public class A041941 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041941() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0, 1367964, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 4, 5, 54, 167, 555, 5717, 6272, 30805, 1361692, 5477573, 6839265, 73870223, 228449934, 759220025, 7820650184L, 8579870209L, 42140131020L});
  }
}
