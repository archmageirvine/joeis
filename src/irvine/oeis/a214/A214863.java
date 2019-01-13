package irvine.oeis.a214;

import irvine.oeis.LinearRecurrence;

/**
 * A214863.
 * @author Sean A. Irvine
 */
public class A214863 extends LinearRecurrence {

  /** Construct the sequence. */
  public A214863() {
    super(new long[] {-1, 1, 1}, new long[] {11, 15, 27});
  }
}
