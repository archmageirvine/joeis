package irvine.oeis.a080;

import irvine.oeis.LinearRecurrence;

/**
 * A080420.
 * @author Sean A. Irvine
 */
public class A080420 extends LinearRecurrence {

  /** Construct the sequence. */
  public A080420() {
    super(new long[] {27, -27, 9}, new long[] {1, 7, 36});
  }
}
