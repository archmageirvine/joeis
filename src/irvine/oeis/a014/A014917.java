package irvine.oeis.a014;

import irvine.oeis.LinearRecurrence;

/**
 * A014917.
 * @author Sean A. Irvine
 */
public class A014917 extends LinearRecurrence {

  /** Construct the sequence. */
  public A014917() {
    super(new long[] {25, -35, 11}, new long[] {1, 11, 86});
  }
}
