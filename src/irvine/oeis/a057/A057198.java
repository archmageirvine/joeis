package irvine.oeis.a057;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A057198 a(n) = (5*3^(n-1)+1)/2.
 * @author Sean A. Irvine
 */
public class A057198 extends LinearRecurrence {

  /** Construct the sequence. */
  public A057198() {
    super(new long[] {-3, 4}, new long[] {3, 8});
  }
}
