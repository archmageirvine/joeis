package irvine.oeis.a140;

import irvine.oeis.LinearRecurrence;

/**
 * A140672 <code>a(n) = n*(3*n + 13)/2</code>.
 * @author Sean A. Irvine
 */
public class A140672 extends LinearRecurrence {

  /** Construct the sequence. */
  public A140672() {
    super(new long[] {1, -3, 3}, new long[] {0, 8, 19});
  }
}
