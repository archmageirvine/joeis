package irvine.oeis.a262;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A262077 The first of thirteen consecutive positive integers the sum of the squares of which is equal to the sum of the squares of seven consecutive positive integers.
 * @author Sean A. Irvine
 */
public class A262077 extends LinearRecurrence {

  /** Construct the sequence. */
  public A262077() {
    super(new long[] {1, -1, -3148, 3148, 1}, new long[] {15, 435, 66543, 1388283, 209496225});
  }
}
