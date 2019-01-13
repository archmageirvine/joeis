package irvine.oeis.a134;

import irvine.oeis.LinearRecurrence;

/**
 * A134011.
 * @author Sean A. Irvine
 */
public class A134011 extends LinearRecurrence {

  /** Construct the sequence. */
  public A134011() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 2, 3, 4, 5, 4, 3, 2, 1});
  }
}
