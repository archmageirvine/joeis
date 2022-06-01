package irvine.oeis.a090;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A090042 a(n) = 2*a(n-1) + 11*a(n-2) for n &gt; 1, a(0) = a(1) = 1.
 * @author Sean A. Irvine
 */
public class A090042 extends LinearRecurrence {

  /** Construct the sequence. */
  public A090042() {
    super(new long[] {11, 2}, new long[] {1, 1});
  }
}
