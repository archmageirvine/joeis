package irvine.oeis.a100;

import irvine.oeis.LinearRecurrence;

/**
 * A100237 Secondary diagonal of triangle A100235 divided by row number: <code>a(n) =</code> A100235(n+1,n)/(n+1) for <code>n&gt;=0</code>.
 * @author Sean A. Irvine
 */
public class A100237 extends LinearRecurrence {

  /** Construct the sequence. */
  public A100237() {
    super(new long[] {1, 5}, new long[] {1, 4});
  }
}
