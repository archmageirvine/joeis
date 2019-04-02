package irvine.oeis.a199;

import irvine.oeis.LinearRecurrence;

/**
 * A199018 (3*11^n-1)/2.
 * @author Sean A. Irvine
 */
public class A199018 extends LinearRecurrence {

  /** Construct the sequence. */
  public A199018() {
    super(new long[] {-11, 12}, new long[] {1, 16});
  }
}
