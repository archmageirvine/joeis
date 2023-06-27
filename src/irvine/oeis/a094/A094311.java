package irvine.oeis.a094;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A094311 n(1+n^2)((2+n^2)^2-n^2)/16.
 * @author Sean A. Irvine
 */
public class A094311 extends LinearRecurrence {

  /** Construct the sequence. */
  public A094311() {
    super(1, new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {1, 20, 210, 1309, 5720, 19536, 55825, 139490});
  }
}
