package irvine.oeis.a027;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A027471 a(n) = (n-1)*3^(n-2), n &gt; 0.
 * @author Sean A. Irvine
 */
public class A027471 extends LinearRecurrence {

  /** Construct the sequence. */
  public A027471() {
    super(1, new long[] {-9, 6}, new long[] {0, 1});
  }
}
