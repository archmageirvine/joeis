package irvine.oeis.a278;

import irvine.oeis.LinearRecurrence;

/**
 * A278130 <code>a(n) = 492*2^n - 222</code>.
 * @author Sean A. Irvine
 */
public class A278130 extends LinearRecurrence {

  /** Construct the sequence. */
  public A278130() {
    super(new long[] {-2, 3}, new long[] {270, 762});
  }
}
