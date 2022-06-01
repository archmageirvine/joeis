package irvine.oeis.a056;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A056699 First differences are 2,1,-2,3 (repeated).
 * @author Sean A. Irvine
 */
public class A056699 extends LinearRecurrence {

  /** Construct the sequence. */
  public A056699() {
    super(new long[] {-1, 1, 0, 0, 1}, new long[] {1, 3, 4, 2, 5});
  }
}
