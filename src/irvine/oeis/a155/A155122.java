package irvine.oeis.a155;

import irvine.oeis.LinearRecurrence;

/**
 * A155122 4*(3*n+2)*(2*n+1)*(n+2)*(n+1).
 * @author Sean A. Irvine
 */
public class A155122 extends LinearRecurrence {

  /** Construct the sequence. */
  public A155122() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 16, 360, 1920, 6160});
  }
}
