package irvine.oeis.a128;

import irvine.oeis.LinearRecurrence;

/**
 * A128016.
 * @author Sean A. Irvine
 */
public class A128016 extends LinearRecurrence {

  /** Construct the sequence. */
  public A128016() {
    super(new long[] {-1, 0, 1, 0}, new long[] {1, 1, 2, 2});
  }
}
