package irvine.oeis.a087;

import irvine.oeis.LinearRecurrence;

/**
 * A087449 <code>a(n) = n * 4^(n-1) + (2*4^n + 1) / 3</code>.
 * @author Sean A. Irvine
 */
public class A087449 extends LinearRecurrence {

  /** Construct the sequence. */
  public A087449() {
    super(new long[] {16, -24, 9}, new long[] {1, 4, 19});
  }
}
