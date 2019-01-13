package irvine.oeis.a060;

import irvine.oeis.LinearRecurrence;

/**
 * A060747.
 * @author Sean A. Irvine
 */
public class A060747 extends LinearRecurrence {

  /** Construct the sequence. */
  public A060747() {
    super(new long[] {-1, 2}, new long[] {-1, 1});
  }
}
