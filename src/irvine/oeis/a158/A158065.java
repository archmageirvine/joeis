package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158065 <code>a(n) = 36*n + 1</code>.
 * @author Sean A. Irvine
 */
public class A158065 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158065() {
    super(new long[] {-1, 2}, new long[] {37, 73});
  }
}
