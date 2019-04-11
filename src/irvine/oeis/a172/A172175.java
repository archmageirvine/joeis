package irvine.oeis.a172;

import irvine.oeis.LinearRecurrence;

/**
 * A172175 <code>a(n) = a(n-1)*110 + 1</code>.
 * @author Sean A. Irvine
 */
public class A172175 extends LinearRecurrence {

  /** Construct the sequence. */
  public A172175() {
    super(new long[] {-110, 111}, new long[] {1, 111});
  }
}
