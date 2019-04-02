package irvine.oeis.a015;

import irvine.oeis.LinearRecurrence;

/**
 * A015612 a(n) = 12*a(n-1) + 11*a(n-2).
 * @author Sean A. Irvine
 */
public class A015612 extends LinearRecurrence {

  /** Construct the sequence. */
  public A015612() {
    super(new long[] {11, 12}, new long[] {0, 1});
  }
}
