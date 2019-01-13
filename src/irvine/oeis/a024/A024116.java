package irvine.oeis.a024;

import irvine.oeis.LinearRecurrence;

/**
 * A024116.
 * @author Sean A. Irvine
 */
public class A024116 extends LinearRecurrence {

  /** Construct the sequence. */
  public A024116() {
    super(new long[] {-10, 31, -33, 13}, new long[] {1, 9, 96, 991});
  }
}
