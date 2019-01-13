package irvine.oeis.a033;

import irvine.oeis.LinearRecurrence;

/**
 * A033136.
 * @author Sean A. Irvine
 */
public class A033136 extends LinearRecurrence {

  /** Construct the sequence. */
  public A033136() {
    super(new long[] {-9, 1, 0, 9}, new long[] {1, 10, 90, 811});
  }
}
