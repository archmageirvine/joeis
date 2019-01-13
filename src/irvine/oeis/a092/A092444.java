package irvine.oeis.a092;

import irvine.oeis.LinearRecurrence;

/**
 * A092444.
 * @author Sean A. Irvine
 */
public class A092444 extends LinearRecurrence {

  /** Construct the sequence. */
  public A092444() {
    super(new long[] {1, -12, 12}, new long[] {1, 1, 7});
  }
}
