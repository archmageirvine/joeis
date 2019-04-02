package irvine.oeis.a193;

import irvine.oeis.LinearRecurrence;

/**
 * A193090 Digital roots of the nonzero pentagonal numbers.
 * @author Sean A. Irvine
 */
public class A193090 extends LinearRecurrence {

  /** Construct the sequence. */
  public A193090() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 5, 3, 4, 8, 6, 7, 2, 9});
  }
}
