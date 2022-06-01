package irvine.oeis.a056;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A056918 a(n) = 9*a(n-1)-a(n-2); a(0)=2, a(1)=9.
 * @author Sean A. Irvine
 */
public class A056918 extends LinearRecurrence {

  /** Construct the sequence. */
  public A056918() {
    super(new long[] {-1, 9}, new long[] {2, 9});
  }
}
