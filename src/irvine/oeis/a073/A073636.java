package irvine.oeis.a073;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A073636 Period 3: repeat [1, 8, 9] ; Digital root of A000578(n) = n^3 for n &gt;= 1.
 * @author Sean A. Irvine
 */
public class A073636 extends LinearRecurrence {

  /** Construct the sequence. */
  public A073636() {
    super(1, new long[] {1, 0, 0}, new long[] {1, 8, 9});
  }
}
