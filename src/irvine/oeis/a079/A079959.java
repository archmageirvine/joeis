package irvine.oeis.a079;

import irvine.oeis.LinearRecurrence;

/**
 * A079959.
 * @author Sean A. Irvine
 */
public class A079959 extends LinearRecurrence {

  /** Construct the sequence. */
  public A079959() {
    super(new long[] {1, 0, 1, 0, 1, 1}, new long[] {1, 1, 2, 3, 6, 10});
  }
}
