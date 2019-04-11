package irvine.oeis.a125;

import irvine.oeis.LinearRecurrence;

/**
 * A125925 Sprague-Grundy values for octal game <code>.351</code>.
 * @author Sean A. Irvine
 */
public class A125925 extends LinearRecurrence {

  /** Construct the sequence. */
  public A125925() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 2, 1, 2, 0, 1, 0, 2});
  }
}
