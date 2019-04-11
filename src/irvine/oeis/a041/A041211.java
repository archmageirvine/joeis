package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041211 Denominators of continued fraction convergents to <code>sqrt(116)</code>.
 * @author Sean A. Irvine
 */
public class A041211 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041211() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 19602, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 1, 4, 9, 13, 61, 74, 209, 701, 910, 18901, 19811, 78334, 176479, 254813, 1195731, 1450544, 4096819, 13741001, 17837820});
  }
}
