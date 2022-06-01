package irvine.oeis.a204;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A204454 Odd numbers not divisible by 11.
 * @author Sean A. Irvine
 */
public class A204454 extends LinearRecurrence {

  /** Construct the sequence. */
  public A204454() {
    super(new long[] {-1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1}, new long[] {1, 3, 5, 7, 9, 13, 15, 17, 19, 21, 23});
  }
}
