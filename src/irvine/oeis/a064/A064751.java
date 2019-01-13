package irvine.oeis.a064;

import irvine.oeis.LinearRecurrence;

/**
 * A064751.
 * @author Sean A. Irvine
 */
public class A064751 extends LinearRecurrence {

  /** Construct the sequence. */
  public A064751() {
    super(new long[] {25, -35, 11}, new long[] {4, 49, 374});
  }
}
