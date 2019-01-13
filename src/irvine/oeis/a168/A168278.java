package irvine.oeis.a168;

import irvine.oeis.LinearRecurrence;

/**
 * A168278.
 * @author Sean A. Irvine
 */
public class A168278 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168278() {
    super(new long[] {-1, 1, 1}, new long[] {2, 7, 7});
  }
}
