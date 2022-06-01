package irvine.oeis.a241;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A241031 Sum of n-th powers of divisors of 28.
 * @author Sean A. Irvine
 */
public class A241031 extends LinearRecurrence {

  /** Construct the sequence. */
  public A241031() {
    super(new long[] {-21952, 43904, -29204, 8240, -1043, 56}, new long[] {6, 56, 1050, 25112, 655746, 17766056});
  }
}
