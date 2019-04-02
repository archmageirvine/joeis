package irvine.oeis.a051;

import irvine.oeis.LinearRecurrence;

/**
 * A051376 Number of Boolean functions of n variables and rank 4 from Post class F(5,inf).
 * @author Sean A. Irvine
 */
public class A051376 extends LinearRecurrence {

  /** Construct the sequence. */
  public A051376() {
    super(new long[] {-1344, 3160, -2734, 1135, -241, 25}, new long[] {0, 0, 3, 134, 1935, 20830});
  }
}
