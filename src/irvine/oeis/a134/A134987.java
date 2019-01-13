package irvine.oeis.a134;

import irvine.oeis.LinearRecurrence;

/**
 * A134987.
 * @author Sean A. Irvine
 */
public class A134987 extends LinearRecurrence {

  /** Construct the sequence. */
  public A134987() {
    super(new long[] {2, -1, 4, -6, 4}, new long[] {0, 0, 0, 0, 1});
  }
}
