package irvine.oeis.a095;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A095342 Number of elements in n-th string generated by a Kolakoski(5,1) rule starting with a(1)=1.
 * @author Sean A. Irvine
 */
public class A095342 extends LinearRecurrence {

  /** Construct the sequence. */
  public A095342() {
    super(1, new long[] {2, 3, 0}, new long[] {1, 1, 5});
  }
}
