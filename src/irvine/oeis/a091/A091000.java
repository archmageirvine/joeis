package irvine.oeis.a091;

import irvine.oeis.LinearRecurrence;

/**
 * A091000.
 * @author Sean A. Irvine
 */
public class A091000 extends LinearRecurrence {

  /** Construct the sequence. */
  public A091000() {
    super(new long[] {-6, 5, 2}, new long[] {1, 0, 3});
  }
}
