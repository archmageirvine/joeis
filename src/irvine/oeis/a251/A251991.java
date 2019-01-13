package irvine.oeis.a251;

import irvine.oeis.LinearRecurrence;

/**
 * A251991.
 * @author Sean A. Irvine
 */
public class A251991 extends LinearRecurrence {

  /** Construct the sequence. */
  public A251991() {
    super(new long[] {1, -195, 195}, new long[] {60, 11704, 2270580});
  }
}
