package irvine.oeis.a016;

import irvine.oeis.LinearRecurrence;

/**
 * A016301.
 * @author Sean A. Irvine
 */
public class A016301 extends LinearRecurrence {

  /** Construct the sequence. */
  public A016301() {
    super(new long[] {110, -87, 18}, new long[] {1, 18, 237});
  }
}
