package irvine.oeis.a199;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A199490 (11*7^n+1)/3.
 * @author Sean A. Irvine
 */
public class A199490 extends LinearRecurrence {

  /** Construct the sequence. */
  public A199490() {
    super(new long[] {-7, 8}, new long[] {4, 26});
  }
}
