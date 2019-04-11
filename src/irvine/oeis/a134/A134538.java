package irvine.oeis.a134;

import irvine.oeis.LinearRecurrence;

/**
 * A134538 <code>5n^2 - 1</code>.
 * @author Sean A. Irvine
 */
public class A134538 extends LinearRecurrence {

  /** Construct the sequence. */
  public A134538() {
    super(new long[] {1, -3, 3}, new long[] {4, 19, 44});
  }
}
