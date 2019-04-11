package irvine.oeis.a247;

import irvine.oeis.LinearRecurrence;

/**
 * A247853 The 8th Hermite Polynomial evaluated at n: H_8(n) <code>= 256*n^8-3584*n^6+13440*n^4-13440*n^2+1680</code>.
 * @author Sean A. Irvine
 */
public class A247853 extends LinearRecurrence {

  /** Construct the sequence. */
  public A247853() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {1680, -1648, -880, 36240, 5324432, 52065680, 279702672, 1085747600, 3409634960L});
  }
}
