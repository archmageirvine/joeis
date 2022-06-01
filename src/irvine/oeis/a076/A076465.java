package irvine.oeis.a076;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A076465 Sum of squares of numbers that can be written as t*n + u*(n+1) for nonnegative integers t,u in exactly n ways.
 * @author Sean A. Irvine
 */
public class A076465 extends LinearRecurrence {

  /** Construct the sequence. */
  public A076465() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {1, 571, 12938, 115270, 630755, 2543401, 8307796, 23249388, 57792165});
  }
}
