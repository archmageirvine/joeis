package irvine.oeis.a094;

import irvine.oeis.LinearRecurrence;

/**
 * A094726 Let M = the 2 X 2 matrix [ 0 3 / 3 2]. Take (M^n * [1 1])/3 = [p q]; then a(n) = p.
 * @author Sean A. Irvine
 */
public class A094726 extends LinearRecurrence {

  /** Construct the sequence. */
  public A094726() {
    super(new long[] {9, 2}, new long[] {1, 5});
  }
}
