package irvine.oeis.a274;

import irvine.oeis.LinearRecurrence;

/**
 * A274077 <code>a(n) = n^3 + 4</code>.
 * @author Sean A. Irvine
 */
public class A274077 extends LinearRecurrence {

  /** Construct the sequence. */
  public A274077() {
    super(new long[] {-1, 4, -6, 4}, new long[] {4, 5, 12, 31});
  }
}
