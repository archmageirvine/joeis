package irvine.oeis.a174;

import irvine.oeis.LinearRecurrence;

/**
 * A174751.
 * @author Sean A. Irvine
 */
public class A174751 extends LinearRecurrence {

  /** Construct the sequence. */
  public A174751() {
    super(new long[] {-1, 50}, new long[] {1, 25});
  }
}
