package irvine.oeis.a108;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A108356 Count, repeating multiples of 3 four times, all other numbers twice.
 * @author Sean A. Irvine
 */
public class A108356 extends LinearRecurrence {

  /** Construct the sequence. */
  public A108356() {
    super(new long[] {-1, 1, 0, 0, 0, 0, 0, 0, 1}, new long[] {1, 1, 2, 2, 3, 3, 3, 3, 4});
  }
}
