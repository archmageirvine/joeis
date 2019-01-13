package irvine.oeis.a178;

import irvine.oeis.LinearRecurrence;

/**
 * A178719.
 * @author Sean A. Irvine
 */
public class A178719 extends LinearRecurrence {

  /** Construct the sequence. */
  public A178719() {
    super(new long[] {6, -7, -5, 7}, new long[] {0, 0, 1, 7});
  }
}
