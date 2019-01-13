package irvine.oeis.a244;

import irvine.oeis.LinearRecurrence;

/**
 * A244866.
 * @author Sean A. Irvine
 */
public class A244866 extends LinearRecurrence {

  /** Construct the sequence. */
  public A244866() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {1, 18, 114, 438, 1263, 3024});
  }
}
