package irvine.oeis.a033;

import irvine.oeis.LinearRecurrence;

/**
 * A033991.
 * @author Sean A. Irvine
 */
public class A033991 extends LinearRecurrence {

  /** Construct the sequence. */
  public A033991() {
    super(new long[] {1, -3, 3}, new long[] {0, 3, 14});
  }
}
