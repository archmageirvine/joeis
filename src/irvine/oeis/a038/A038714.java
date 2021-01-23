package irvine.oeis.a038;

import irvine.oeis.LinearRecurrence;

/**
 * A038714 Promic numbers repeated 4 times; a(n) = floor(n/4) * ceiling((n+1)/4).
 * @author Sean A. Irvine
 */
public class A038714 extends LinearRecurrence {

  /** Construct the sequence. */
  public A038714() {
    super(new long[] {1, -1, 0, 0, -2, 2, 0, 0, 1}, new long[] {0, 0, 0, 0, 2, 2, 2, 2, 6});
  }
}
