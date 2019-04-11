package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158057 First differences of A051870: <code>16*n + 1</code>.
 * @author Sean A. Irvine
 */
public class A158057 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158057() {
    super(new long[] {-1, 2}, new long[] {1, 17});
  }
}
