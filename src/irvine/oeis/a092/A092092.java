package irvine.oeis.a092;

import irvine.oeis.LinearRecurrence;

/**
 * A092092.
 * @author Sean A. Irvine
 */
public class A092092 extends LinearRecurrence {

  /** Construct the sequence. */
  public A092092() {
    super(new long[] {-1, 0, 0, 2, 0, 0}, new long[] {1, 1, 0, 3, 2, 0});
  }
}
