package irvine.oeis.a161;

import irvine.oeis.LinearRecurrence;

/**
 * A161585.
 * @author Sean A. Irvine
 */
public class A161585 extends LinearRecurrence {

  /** Construct the sequence. */
  public A161585() {
    super(new long[] {1, -80, 80}, new long[] {0, 9, 720});
  }
}
