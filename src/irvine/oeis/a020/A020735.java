package irvine.oeis.a020;

import irvine.oeis.LinearRecurrence;

/**
 * A020735 Odd numbers <code>&gt;= 5</code>.
 * @author Sean A. Irvine
 */
public class A020735 extends LinearRecurrence {

  /** Construct the sequence. */
  public A020735() {
    super(new long[] {-1, 2}, new long[] {5, 7});
  }
}
