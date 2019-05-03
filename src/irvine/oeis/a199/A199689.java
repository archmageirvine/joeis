package irvine.oeis.a199;

import irvine.oeis.LinearRecurrence;

/**
 * A199689 <code>8*10^n+1</code>.
 * @author Sean A. Irvine
 */
public class A199689 extends LinearRecurrence {

  /** Construct the sequence. */
  public A199689() {
    super(new long[] {-10, 11}, new long[] {9, 81});
  }
}
