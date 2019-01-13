package irvine.oeis.a261;

import irvine.oeis.LinearRecurrence;

/**
 * A261972.
 * @author Sean A. Irvine
 */
public class A261972 extends LinearRecurrence {

  /** Construct the sequence. */
  public A261972() {
    super(new long[] {1, -15, 15}, new long[] {25, 361, 5041});
  }
}
