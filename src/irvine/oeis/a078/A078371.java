package irvine.oeis.a078;

import irvine.oeis.LinearRecurrence;

/**
 * A078371.
 * @author Sean A. Irvine
 */
public class A078371 extends LinearRecurrence {

  /** Construct the sequence. */
  public A078371() {
    super(new long[] {1, -3, 3}, new long[] {5, 21, 45});
  }
}
