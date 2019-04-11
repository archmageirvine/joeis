package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016999 <code>a(n) = (7*n + 1)^7</code>.
 * @author Sean A. Irvine
 */
public class A016999 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016999() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {1, 2097152, 170859375, 2494357888L, 17249876309L, 78364164096L, 271818611107L, 781250000000L});
  }
}
