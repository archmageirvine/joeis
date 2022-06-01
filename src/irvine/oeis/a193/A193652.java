package irvine.oeis.a193;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A193652 A020988 and A007583 interleaved.
 * @author Sean A. Irvine
 */
public class A193652 extends LinearRecurrence {

  /** Construct the sequence. */
  public A193652() {
    super(new long[] {-4, 0, 5, 0}, new long[] {0, 1, 2, 3});
  }
}
