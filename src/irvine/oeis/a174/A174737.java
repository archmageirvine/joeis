package irvine.oeis.a174;

import irvine.oeis.LinearRecurrence;

/**
 * A174737.
 * @author Sean A. Irvine
 */
public class A174737 extends LinearRecurrence {

  /** Construct the sequence. */
  public A174737() {
    super(new long[] {-1, 1}, new long[] {2, -1});
  }
}
