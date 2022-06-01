package irvine.oeis.a246;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A246059 (17*10^n-8)/9.
 * @author Sean A. Irvine
 */
public class A246059 extends LinearRecurrence {

  /** Construct the sequence. */
  public A246059() {
    super(new long[] {-10, 11}, new long[] {1, 18});
  }
}
