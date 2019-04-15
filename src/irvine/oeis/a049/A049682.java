package irvine.oeis.a049;

import irvine.oeis.LinearRecurrence;

/**
 * A049682 <code>a(n) = (Lucas(8*n) - 2)/45</code>.
 * @author Sean A. Irvine
 */
public class A049682 extends LinearRecurrence {

  /** Construct the sequence. */
  public A049682() {
    super(new long[] {1, -48, 48}, new long[] {0, 1, 49});
  }
}
