package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017053 <code>a(n) = 7*n + 6</code>.
 * @author Sean A. Irvine
 */
public class A017053 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017053() {
    super(new long[] {-1, 2}, new long[] {6, 13});
  }
}
