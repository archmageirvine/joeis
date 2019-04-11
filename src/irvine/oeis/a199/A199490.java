package irvine.oeis.a199;

import irvine.oeis.LinearRecurrence;

/**
 * A199490 <code>(11*7^n+1)/3</code>.
 * @author Sean A. Irvine
 */
public class A199490 extends LinearRecurrence {

  /** Construct the sequence. */
  public A199490() {
    super(new long[] {-7, 8}, new long[] {4, 26});
  }
}
