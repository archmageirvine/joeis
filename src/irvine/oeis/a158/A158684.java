package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158684 <code>a(n) = 64*n^2 - 1</code>.
 * @author Sean A. Irvine
 */
public class A158684 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158684() {
    super(new long[] {1, -3, 3}, new long[] {63, 255, 575});
  }
}
