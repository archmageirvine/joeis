package irvine.oeis.a217;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A217775 a(n) = n*(n+1) + (n+2)*(n+3) + (n+4)*(n+5).
 * @author Sean A. Irvine
 */
public class A217775 extends LinearRecurrence {

  /** Construct the sequence. */
  public A217775() {
    super(new long[] {1, -3, 3}, new long[] {26, 44, 68});
  }
}
