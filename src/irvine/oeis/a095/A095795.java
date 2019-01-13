package irvine.oeis.a095;

import irvine.oeis.LinearRecurrence;

/**
 * A095795.
 * @author Sean A. Irvine
 */
public class A095795 extends LinearRecurrence {

  /** Construct the sequence. */
  public A095795() {
    super(new long[] {1, 0, 1, 0}, new long[] {2, 5, 7, 2});
  }
}
