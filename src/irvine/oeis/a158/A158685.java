package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158685 32*(32*n^2+1).
 * @author Sean A. Irvine
 */
public class A158685 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158685() {
    super(new long[] {1, -3, 3}, new long[] {32, 1056, 4128});
  }
}
