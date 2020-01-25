package irvine.oeis.a056;

import irvine.oeis.LinearRecurrence;

/**
 * A056126 <code>a(n) = n*(n + 17)/2</code>.
 * @author Sean A. Irvine
 */
public class A056126 extends LinearRecurrence {

  /** Construct the sequence. */
  public A056126() {
    super(new long[] {1, -3, 3}, new long[] {0, 9, 19});
  }
}
