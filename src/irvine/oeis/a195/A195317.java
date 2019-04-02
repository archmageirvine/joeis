package irvine.oeis.a195;

import irvine.oeis.LinearRecurrence;

/**
 * A195317 Centered 40-gonal numbers.
 * @author Sean A. Irvine
 */
public class A195317 extends LinearRecurrence {

  /** Construct the sequence. */
  public A195317() {
    super(new long[] {1, -3, 3}, new long[] {1, 41, 121});
  }
}
