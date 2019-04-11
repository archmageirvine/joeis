package irvine.oeis.a139;

import irvine.oeis.LinearRecurrence;

/**
 * A139606 <code>a(n) = 15*n + 6</code>.
 * @author Sean A. Irvine
 */
public class A139606 extends LinearRecurrence {

  /** Construct the sequence. */
  public A139606() {
    super(new long[] {-1, 2}, new long[] {6, 21});
  }
}
