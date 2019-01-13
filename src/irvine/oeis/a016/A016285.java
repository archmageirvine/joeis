package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016285.
 * @author Sean A. Irvine
 */
public class A016285 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016285() {
    super(new long[] {56, -50, 13}, new long[] {1, 13, 119});
  }
}
