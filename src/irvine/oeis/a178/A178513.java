package irvine.oeis.a178;

import irvine.oeis.LinearRecurrence;

/**
 * A178513 Partial sums of 80^n.
 * @author Sean A. Irvine
 */
public class A178513 extends LinearRecurrence {

  /** Construct the sequence. */
  public A178513() {
    super(new long[] {-80, 81}, new long[] {1, 81});
  }
}
