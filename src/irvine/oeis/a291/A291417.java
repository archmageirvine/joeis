package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291417.
 * @author Sean A. Irvine
 */
public class A291417 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291417() {
    super(new long[] {-2, -4, 2, 4}, new long[] {4, 18, 76, 322});
  }
}
