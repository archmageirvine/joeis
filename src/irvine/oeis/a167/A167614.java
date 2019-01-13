package irvine.oeis.a167;

import irvine.oeis.LinearRecurrence;

/**
 * A167614.
 * @author Sean A. Irvine
 */
public class A167614 extends LinearRecurrence {

  /** Construct the sequence. */
  public A167614() {
    super(new long[] {1, -3, 3}, new long[] {6, 9, 13});
  }
}
