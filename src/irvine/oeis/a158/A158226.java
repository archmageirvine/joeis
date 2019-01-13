package irvine.oeis.a158;

import irvine.oeis.LinearRecurrence;

/**
 * A158226.
 * @author Sean A. Irvine
 */
public class A158226 extends LinearRecurrence {

  /** Construct the sequence. */
  public A158226() {
    super(new long[] {1, -3, 3}, new long[] {223, 896, 2019});
  }
}
