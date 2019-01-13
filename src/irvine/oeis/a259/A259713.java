package irvine.oeis.a259;

import irvine.oeis.LinearRecurrence;

/**
 * A259713.
 * @author Sean A. Irvine
 */
public class A259713 extends LinearRecurrence {

  /** Construct the sequence. */
  public A259713() {
    super(new long[] {2, 1}, new long[] {1, 8});
  }
}
