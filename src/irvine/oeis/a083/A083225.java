package irvine.oeis.a083;

import irvine.oeis.LinearRecurrence;

/**
 * A083225 <code>a(n) = (7*8^n + (-8)^n)/8</code>.
 * @author Sean A. Irvine
 */
public class A083225 extends LinearRecurrence {

  /** Construct the sequence. */
  public A083225() {
    super(new long[] {64, 0}, new long[] {1, 6});
  }
}
