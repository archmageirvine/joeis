package irvine.oeis.a192;

import irvine.oeis.LinearRecurrence;

/**
 * A192803.
 * @author Sean A. Irvine
 */
public class A192803 extends LinearRecurrence {

  /** Construct the sequence. */
  public A192803() {
    super(new long[] {11, -15, 7}, new long[] {0, 0, 1});
  }
}
