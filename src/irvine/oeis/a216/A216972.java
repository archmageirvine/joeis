package irvine.oeis.a216;

import irvine.oeis.LinearRecurrence;

/**
 * A216972 <code>a(4n+2) = 2</code>, otherwise <code>a(n) = n</code>.
 * @author Sean A. Irvine
 */
public class A216972 extends LinearRecurrence {

  /** Construct the sequence. */
  public A216972() {
    super(new long[] {-1, 0, 0, 0, 2, 0, 0, 0}, new long[] {0, 1, 2, 3, 4, 5, 2, 7});
  }
}
