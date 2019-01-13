package irvine.oeis.a263;

import irvine.oeis.LinearRecurrence;

/**
 * A263944.
 * @author Sean A. Irvine
 */
public class A263944 extends LinearRecurrence {

  /** Construct the sequence. */
  public A263944() {
    super(new long[] {1, -6, 6}, new long[] {28, 189, 959});
  }
}
