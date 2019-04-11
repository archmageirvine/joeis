package irvine.oeis.a126;

import irvine.oeis.LinearRecurrence;

/**
 * A126665 <code>a(n) = -n^2 + 9n + 53</code>.
 * @author Sean A. Irvine
 */
public class A126665 extends LinearRecurrence {

  /** Construct the sequence. */
  public A126665() {
    super(new long[] {1, -3, 3}, new long[] {53, 61, 67});
  }
}
