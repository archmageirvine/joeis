package irvine.oeis.a161;

import irvine.oeis.LinearRecurrence;

/**
 * A161595.
 * @author Sean A. Irvine
 */
public class A161595 extends LinearRecurrence {

  /** Construct the sequence. */
  public A161595() {
    super(new long[] {-1, 17}, new long[] {1, 16});
  }
}
