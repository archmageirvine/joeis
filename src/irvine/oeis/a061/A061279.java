package irvine.oeis.a061;

import irvine.oeis.LinearRecurrence;

/**
 * A061279.
 * @author Sean A. Irvine
 */
public class A061279 extends LinearRecurrence {

  /** Construct the sequence. */
  public A061279() {
    super(new long[] {2, 2, 0}, new long[] {1, 2, 3});
  }
}
