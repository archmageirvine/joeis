package irvine.oeis.a153;

import irvine.oeis.LinearRecurrence;

/**
 * A153642.
 * @author Sean A. Irvine
 */
public class A153642 extends LinearRecurrence {

  /** Construct the sequence. */
  public A153642() {
    super(new long[] {1, -3, 3}, new long[] {36, 72, 116});
  }
}
