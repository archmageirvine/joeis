package irvine.oeis.a193;

import irvine.oeis.LinearRecurrence;

/**
 * A193653.
 * @author Sean A. Irvine
 */
public class A193653 extends LinearRecurrence {

  /** Construct the sequence. */
  public A193653() {
    super(new long[] {-2, -1, 4}, new long[] {1, 2, 6});
  }
}
