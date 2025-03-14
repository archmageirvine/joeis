package irvine.oeis.a082;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A082411 Second-order linear recurrence sequence with a(n) = a(n-1) + a(n-2), with initial terms 407389224418, 76343678551.
 * @author Sean A. Irvine
 */
public class A082411 extends LinearRecurrence {

  /** Construct the sequence. */
  public A082411() {
    super(new long[] {1, 1}, new long[] {407389224418L, 76343678551L});
  }
}
