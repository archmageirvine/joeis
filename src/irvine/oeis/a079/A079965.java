package irvine.oeis.a079;

import irvine.oeis.LinearRecurrence;

/**
 * A079965.
 * @author Sean A. Irvine
 */
public class A079965 extends LinearRecurrence {

  /** Construct the sequence. */
  public A079965() {
    super(new long[] {1, 1, 0, 1, 1, 0}, new long[] {1, 0, 1, 1, 1, 3});
  }
}
