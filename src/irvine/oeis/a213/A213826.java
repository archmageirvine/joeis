package irvine.oeis.a213;

import irvine.oeis.LinearRecurrence;

/**
 * A213826.
 * @author Sean A. Irvine
 */
public class A213826 extends LinearRecurrence {

  /** Construct the sequence. */
  public A213826() {
    super(new long[] {-1, 4, -6, 4}, new long[] {2, 34, 132, 332});
  }
}
