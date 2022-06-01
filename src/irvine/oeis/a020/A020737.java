package irvine.oeis.a020;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A020737 Pisot sequence L(5,9).
 * @author Sean A. Irvine
 */
public class A020737 extends LinearRecurrence {

  /** Construct the sequence. */
  public A020737() {
    super(new long[] {-2, 3}, new long[] {5, 9});
  }
}
