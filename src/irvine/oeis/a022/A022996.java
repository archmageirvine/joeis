package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022996 40-n.
 * @author Sean A. Irvine
 */
public class A022996 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022996() {
    super(new long[] {-1, 2}, new long[] {40, 39});
  }
}
