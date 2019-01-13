package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291016.
 * @author Sean A. Irvine
 */
public class A291016 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291016() {
    super(new long[] {-6, 6}, new long[] {4, 19});
  }
}
