package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164285 <code>a(n) = 7*2^n + 3</code>.
 * @author Sean A. Irvine
 */
public class A164285 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164285() {
    super(new long[] {-2, 3}, new long[] {10, 17});
  }
}
