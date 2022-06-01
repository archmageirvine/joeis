package irvine.oeis.a254;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A254645 Fourth partial sums of sixth powers (A001014).
 * @author Sean A. Irvine
 */
public class A254645 extends LinearRecurrence {

  /** Construct the sequence. */
  public A254645() {
    super(new long[] {1, -11, 55, -165, 330, -462, 462, -330, 165, -55, 11}, new long[] {1, 68, 995, 7672, 40614, 166992, 571626, 1701480, 4534959, 11050468, 24997973});
  }
}
