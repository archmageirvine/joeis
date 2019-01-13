package irvine.oeis.a014;

import irvine.oeis.LinearRecurrence;

/**
 * A014920.
 * @author Sean A. Irvine
 */
public class A014920 extends LinearRecurrence {

  /** Construct the sequence. */
  public A014920() {
    super(new long[] {49, -63, 15}, new long[] {1, 15, 162});
  }
}
