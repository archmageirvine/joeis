package irvine.oeis.a161;

import irvine.oeis.LinearRecurrence;

/**
 * A161582.
 * @author Sean A. Irvine
 */
public class A161582 extends LinearRecurrence {

  /** Construct the sequence. */
  public A161582() {
    super(new long[] {1, -48, 48}, new long[] {0, 7, 336});
  }
}
