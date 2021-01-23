package irvine.oeis.a155;

import irvine.oeis.LinearRecurrence;

/**
 * A155595 11^n+2^n-1.
 * @author Sean A. Irvine
 */
public class A155595 extends LinearRecurrence {

  /** Construct the sequence. */
  public A155595() {
    super(new long[] {22, -35, 14}, new long[] {1, 12, 124});
  }
}
