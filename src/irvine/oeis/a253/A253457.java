package irvine.oeis.a253;

import irvine.oeis.LinearRecurrence;

/**
 * A253457.
 * @author Sean A. Irvine
 */
public class A253457 extends LinearRecurrence {

  /** Construct the sequence. */
  public A253457() {
    super(new long[] {1, -27, 27}, new long[] {1, 14, 351});
  }
}
