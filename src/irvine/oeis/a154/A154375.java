package irvine.oeis.a154;

import irvine.oeis.LinearRecurrence;

/**
 * A154375.
 * @author Sean A. Irvine
 */
public class A154375 extends LinearRecurrence {

  /** Construct the sequence. */
  public A154375() {
    super(new long[] {1, -3, 3}, new long[] {1351, 5201, 11551});
  }
}
