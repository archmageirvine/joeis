package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158000 <code>a(n) = 338*n + 1</code>.
 * @author Sean A. Irvine
 */
public class A158000 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158000() {
    super(new long[] {-1, 2}, new long[] {339, 677});
  }
}
