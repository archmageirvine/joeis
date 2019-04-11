package irvine.oeis.a262;

import irvine.oeis.LinearRecurrence;

/**
 * A262925 Sum of n consecutive fourth powers starting with <code>n^4</code>.
 * @author Sean A. Irvine
 */
public class A262925 extends LinearRecurrence {

  /** Construct the sequence. */
  public A262925() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {0, 1, 97, 962, 4578, 14979});
  }
}
