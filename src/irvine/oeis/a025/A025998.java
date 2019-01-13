package irvine.oeis.a025;

import irvine.oeis.LinearRecurrence;

/**
 * A025998.
 * @author Sean A. Irvine
 */
public class A025998 extends LinearRecurrence {

  /** Construct the sequence. */
  public A025998() {
    super(new long[] {-800, 740, -216, 25}, new long[] {1, 25, 409, 5565});
  }
}
