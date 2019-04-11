package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158557 <code>a(n) = 225*n^2 + 15</code>.
 * @author Sean A. Irvine
 */
public class A158557 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158557() {
    super(new long[] {1, -3, 3}, new long[] {15, 240, 915});
  }
}
