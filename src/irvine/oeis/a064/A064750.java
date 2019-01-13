package irvine.oeis.a064;

import irvine.oeis.LinearRecurrence;

/**
 * A064750.
 * @author Sean A. Irvine
 */
public class A064750 extends LinearRecurrence {

  /** Construct the sequence. */
  public A064750() {
    super(new long[] {144, -168, 25}, new long[] {1, 13, 289});
  }
}
