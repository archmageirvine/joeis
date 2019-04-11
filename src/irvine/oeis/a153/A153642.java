package irvine.oeis.a153;

import irvine.oeis.LinearRecurrence;

/**
 * A153642 <code>a(n) = 4*n^2 + 24*n + 8</code>.
 * @author Sean A. Irvine
 */
public class A153642 extends LinearRecurrence {

  /** Construct the sequence. */
  public A153642() {
    super(new long[] {1, -3, 3}, new long[] {36, 72, 116});
  }
}
