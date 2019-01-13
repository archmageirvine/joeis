package irvine.oeis.a249;

import irvine.oeis.LinearRecurrence;

/**
 * A249992.
 * @author Sean A. Irvine
 */
public class A249992 extends LinearRecurrence {

  /** Construct the sequence. */
  public A249992() {
    super(new long[] {6, 7, 0}, new long[] {1, 0, 7});
  }
}
