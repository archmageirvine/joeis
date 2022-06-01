package irvine.oeis.a198;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A198276 19*2^n-1.
 * @author Sean A. Irvine
 */
public class A198276 extends LinearRecurrence {

  /** Construct the sequence. */
  public A198276() {
    super(new long[] {-2, 3}, new long[] {18, 37});
  }
}
