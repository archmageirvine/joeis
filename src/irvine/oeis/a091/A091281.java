package irvine.oeis.a091;

import irvine.oeis.LinearRecurrence;

/**
 * A091281.
 * @author Sean A. Irvine
 */
public class A091281 extends LinearRecurrence {

  /** Construct the sequence. */
  public A091281() {
    super(new long[] {-360, 24, 15}, new long[] {1, 5, 91});
  }
}
