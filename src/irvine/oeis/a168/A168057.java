package irvine.oeis.a168;

import irvine.oeis.LinearRecurrence;

/**
 * A168057.
 * @author Sean A. Irvine
 */
public class A168057 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168057() {
    super(new long[] {-16, 8, 0, 2}, new long[] {1, 2, 12, 40});
  }
}
