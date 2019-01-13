package irvine.oeis.a221;

import irvine.oeis.LinearRecurrence;

/**
 * A221172.
 * @author Sean A. Irvine
 */
public class A221172 extends LinearRecurrence {

  /** Construct the sequence. */
  public A221172() {
    super(new long[] {1, 2}, new long[] {-2, 3});
  }
}
