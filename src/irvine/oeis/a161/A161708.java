package irvine.oeis.a161;

import irvine.oeis.LinearRecurrence;

/**
 * A161708.
 * @author Sean A. Irvine
 */
public class A161708 extends LinearRecurrence {

  /** Construct the sequence. */
  public A161708() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 2, 11, 22});
  }
}
