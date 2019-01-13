package irvine.oeis.a180;

import irvine.oeis.LinearRecurrence;

/**
 * A180579.
 * @author Sean A. Irvine
 */
public class A180579 extends LinearRecurrence {

  /** Construct the sequence. */
  public A180579() {
    super(new long[] {1, -3, 3}, new long[] {15, 78, 189});
  }
}
