package irvine.oeis.a179;

import irvine.oeis.LinearRecurrence;

/**
 * A179601.
 * @author Sean A. Irvine
 */
public class A179601 extends LinearRecurrence {

  /** Construct the sequence. */
  public A179601() {
    super(new long[] {4, 10, 2}, new long[] {1, 6, 22});
  }
}
