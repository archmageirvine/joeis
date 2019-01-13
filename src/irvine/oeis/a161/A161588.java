package irvine.oeis.a161;

import irvine.oeis.LinearRecurrence;

/**
 * A161588.
 * @author Sean A. Irvine
 */
public class A161588 extends LinearRecurrence {

  /** Construct the sequence. */
  public A161588() {
    super(new long[] {1, -168, 168}, new long[] {0, 13, 2184});
  }
}
