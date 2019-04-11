package irvine.oeis.a228;

import irvine.oeis.LinearRecurrence;

/**
 * A228568 <code>a(n) =</code> 2^n*A056236(n).
 * @author Sean A. Irvine
 */
public class A228568 extends LinearRecurrence {

  /** Construct the sequence. */
  public A228568() {
    super(new long[] {-8, 8}, new long[] {2, 8});
  }
}
