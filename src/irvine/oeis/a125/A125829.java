package irvine.oeis.a125;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A125829 Sprague-Grundy values for octal game .115.
 * @author Sean A. Irvine
 */
public class A125829 extends LinearRecurrence {

  /** Construct the sequence. */
  public A125829() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 1, 1, 0, 1, 1, 1, 2, 2, 2, 1, 2, 2, 2});
  }
}
