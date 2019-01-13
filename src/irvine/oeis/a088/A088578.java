package irvine.oeis.a088;

import irvine.oeis.LinearRecurrence;

/**
 * A088578.
 * @author Sean A. Irvine
 */
public class A088578 extends LinearRecurrence {

  /** Construct the sequence. */
  public A088578() {
    super(new long[] {4, -8, 5}, new long[] {1, 3, 11});
  }
}
