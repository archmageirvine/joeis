package irvine.oeis.a252;

import irvine.oeis.LinearRecurrence;

/**
 * A252077.
 * @author Sean A. Irvine
 */
public class A252077 extends LinearRecurrence {

  /** Construct the sequence. */
  public A252077() {
    super(new long[] {1, -1443, 1443}, new long[] {1, 769, 1108537});
  }
}
