package irvine.oeis.a034;

import irvine.oeis.LinearRecurrence;

/**
 * A034474 <code>a(n) = 5^n + 1</code>.
 * @author Sean A. Irvine
 */
public class A034474 extends LinearRecurrence {

  /** Construct the sequence. */
  public A034474() {
    super(new long[] {-5, 6}, new long[] {2, 6});
  }
}
