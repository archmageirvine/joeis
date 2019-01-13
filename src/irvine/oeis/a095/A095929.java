package irvine.oeis.a095;

import irvine.oeis.LinearRecurrence;

/**
 * A095929.
 * @author Sean A. Irvine
 */
public class A095929 extends LinearRecurrence {

  /** Construct the sequence. */
  public A095929() {
    super(new long[] {4, -13, 7}, new long[] {1, 2, 6});
  }
}
