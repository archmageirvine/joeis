package irvine.oeis.a168;

import irvine.oeis.LinearRecurrence;

/**
 * A168376.
 * @author Sean A. Irvine
 */
public class A168376 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168376() {
    super(new long[] {-1, 1, 1}, new long[] {3, 3, 10});
  }
}
