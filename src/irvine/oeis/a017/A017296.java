package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017296.
 * @author Sean A. Irvine
 */
public class A017296 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017296() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {16, 20736, 234256, 1048576, 3111696});
  }
}
