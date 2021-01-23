package irvine.oeis.a155;

import irvine.oeis.LinearRecurrence;

/**
 * A155619 8^n+4^n-1^n.
 * @author Sean A. Irvine
 */
public class A155619 extends LinearRecurrence {

  /** Construct the sequence. */
  public A155619() {
    super(new long[] {32, -44, 13}, new long[] {1, 11, 79});
  }
}
