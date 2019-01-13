package irvine.oeis.a028;

import irvine.oeis.LinearRecurrence;

/**
 * A028164.
 * @author Sean A. Irvine
 */
public class A028164 extends LinearRecurrence {

  /** Construct the sequence. */
  public A028164() {
    super(new long[] {-5280, 2768, -494, 37}, new long[] {1, 37, 875, 16865});
  }
}
