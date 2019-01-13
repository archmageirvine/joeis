package irvine.oeis.a134;

import irvine.oeis.LinearRecurrence;

/**
 * A134012.
 * @author Sean A. Irvine
 */
public class A134012 extends LinearRecurrence {

  /** Construct the sequence. */
  public A134012() {
    super(new long[] {1, 0, 0, 0, 0}, new long[] {1, 6, 11, 6, 1});
  }
}
