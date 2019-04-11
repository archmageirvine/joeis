package irvine.oeis.a204;

import irvine.oeis.LinearRecurrence;

/**
 * A204675 <code>a(n) = 16*n^2 + 2*n + 1</code>.
 * @author Sean A. Irvine
 */
public class A204675 extends LinearRecurrence {

  /** Construct the sequence. */
  public A204675() {
    super(new long[] {1, -3, 3}, new long[] {1, 19, 69});
  }
}
