package irvine.oeis.a167;

import irvine.oeis.LinearRecurrence;

/**
 * A167910.
 * @author Sean A. Irvine
 */
public class A167910 extends LinearRecurrence {

  /** Construct the sequence. */
  public A167910() {
    super(new long[] {-12, 4, 3}, new long[] {0, 0, 1});
  }
}
