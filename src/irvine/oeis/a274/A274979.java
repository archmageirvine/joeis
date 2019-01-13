package irvine.oeis.a274;

import irvine.oeis.LinearRecurrence;

/**
 * A274979.
 * @author Sean A. Irvine
 */
public class A274979 extends LinearRecurrence {

  /** Construct the sequence. */
  public A274979() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {0, 1, 15, 18, 46});
  }
}
