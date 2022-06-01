package irvine.oeis.a126;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A126473 Number of strings over a 5 symbol alphabet with adjacent symbols differing by three or less.
 * @author Sean A. Irvine
 */
public class A126473 extends LinearRecurrence {

  /** Construct the sequence. */
  public A126473() {
    super(new long[] {3, 4}, new long[] {1, 5});
  }
}
