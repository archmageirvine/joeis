package irvine.oeis.a255;

import irvine.oeis.LinearRecurrence;

/**
 * A255846.
 * @author Sean A. Irvine
 */
public class A255846 extends LinearRecurrence {

  /** Construct the sequence. */
  public A255846() {
    super(new long[] {1, -3, 3}, new long[] {14, 16, 22});
  }
}
