package irvine.oeis.a077;

import irvine.oeis.LinearRecurrence;

/**
 * A077122.
 * @author Sean A. Irvine
 */
public class A077122 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077122() {
    super(new long[] {32, -96, 106, -53, 12}, new long[] {0, 4, 56, 460, 2976});
  }
}
