package irvine.oeis.a048;

import irvine.oeis.LinearRecurrence;

/**
 * A048770.
 * @author Sean A. Irvine
 */
public class A048770 extends LinearRecurrence {

  /** Construct the sequence. */
  public A048770() {
    super(new long[] {-1, -1, 3}, new long[] {1, 8, 23});
  }
}
