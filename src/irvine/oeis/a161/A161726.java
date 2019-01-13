package irvine.oeis.a161;

import irvine.oeis.LinearRecurrence;

/**
 * A161726.
 * @author Sean A. Irvine
 */
public class A161726 extends LinearRecurrence {

  /** Construct the sequence. */
  public A161726() {
    super(new long[] {1, -3, 3}, new long[] {9479, 8563, 7649});
  }
}
