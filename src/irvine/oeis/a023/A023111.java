package irvine.oeis.a023;

import irvine.oeis.LinearRecurrence;

/**
 * A023111.
 * @author Sean A. Irvine
 */
public class A023111 extends LinearRecurrence {

  /** Construct the sequence. */
  public A023111() {
    super(new long[] {1, -1443, 1443}, new long[] {0, 36, 51984});
  }
}
