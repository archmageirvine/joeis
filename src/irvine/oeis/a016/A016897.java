package irvine.oeis.a016;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A016897 a(n) = 5*n + 4.
 * @author Sean A. Irvine
 */
public class A016897 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016897() {
    super(new long[] {-1, 2}, new long[] {4, 9});
  }
}
