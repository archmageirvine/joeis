package irvine.oeis.a092;

import irvine.oeis.LinearRecurrence;

/**
 * A092185.
 * @author Sean A. Irvine
 */
public class A092185 extends LinearRecurrence {

  /** Construct the sequence. */
  public A092185() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 6, 22, 53});
  }
}
