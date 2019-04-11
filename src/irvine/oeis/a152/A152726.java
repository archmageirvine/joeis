package irvine.oeis.a152;

import irvine.oeis.LinearRecurrence;

/**
 * A152726 <code>a(n) = n^7 - (n-1)^7 + (n-2)^7 - ... + ((-1)^n)*0^7</code>.
 * @author Sean A. Irvine
 */
public class A152726 extends LinearRecurrence {

  /** Construct the sequence. */
  public A152726() {
    super(new long[] {-1, 7, -20, 28, -14, -14, 28, -20, 7}, new long[] {0, 1, 127, 2060, 14324, 63801, 216135, 607408, 1489744});
  }
}
