package irvine.oeis.a155;

import irvine.oeis.LinearRecurrence;

/**
 * A155859 (1/162)*(61*10^n + 18*n + 20).
 * @author Sean A. Irvine
 */
public class A155859 extends LinearRecurrence {

  /** Construct the sequence. */
  public A155859() {
    super(new long[] {10, -21, 12}, new long[] {4, 38, 377});
  }
}
