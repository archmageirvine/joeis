package irvine.oeis.a161;

import irvine.oeis.LinearRecurrence;

/**
 * A161158.
 * @author Sean A. Irvine
 */
public class A161158 extends LinearRecurrence {

  /** Construct the sequence. */
  public A161158() {
    super(new long[] {-1, 14, -34, 14}, new long[] {1, 14, 161, 1792});
  }
}
