package irvine.oeis.a165;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A165224 a(0)=1, a(1)=9, a(n) = 18*a(n-1) - 49*a(n-2) for n &gt; 1.
 * @author Sean A. Irvine
 */
public class A165224 extends LinearRecurrence {

  /** Construct the sequence. */
  public A165224() {
    super(new long[] {-49, 18}, new long[] {1, 9});
  }
}
