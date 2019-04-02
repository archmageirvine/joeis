package irvine.oeis.a195;

import irvine.oeis.LinearRecurrence;

/**
 * A195048 Concentric 19-gonal numbers.
 * @author Sean A. Irvine
 */
public class A195048 extends LinearRecurrence {

  /** Construct the sequence. */
  public A195048() {
    super(new long[] {1, -2, 0, 2}, new long[] {0, 1, 19, 39});
  }
}
