package irvine.oeis.a280;

import irvine.oeis.LinearRecurrence;

/**
 * A280058 Number of <code>2 X 2</code> matrices with entries in <code>{0,1,...,n}</code> with determinant = permanent with no entries repeated.
 * @author Sean A. Irvine
 */
public class A280058 extends LinearRecurrence {

  /** Construct the sequence. */
  public A280058() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 0, 0, 12});
  }
}
