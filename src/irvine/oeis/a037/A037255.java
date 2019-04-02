package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037255 For n weights, number of combinations when limited to two weights per pan.
 * @author Sean A. Irvine
 */
public class A037255 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037255() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 1, 4, 12, 31});
  }
}
