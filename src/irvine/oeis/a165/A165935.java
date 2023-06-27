package irvine.oeis.a165;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A165935 a(n) = (-1)^(n-1)*n*(4n^2-5)^2.
 * @author Sean A. Irvine
 */
public class A165935 extends LinearRecurrence {

  /** Construct the sequence. */
  public A165935() {
    super(1, new long[] {-1, -6, -15, -20, -15, -6}, new long[] {1, -242, 2883, -13924, 45125, -115926});
  }
}
