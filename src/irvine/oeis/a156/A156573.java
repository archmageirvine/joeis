package irvine.oeis.a156;

import irvine.oeis.LinearRecurrence;

/**
 * A156573.
 * @author Sean A. Irvine
 */
public class A156573 extends LinearRecurrence {

  /** Construct the sequence. */
  public A156573() {
    super(new long[] {1, -35, 35}, new long[] {529, 13225, 444889});
  }
}
