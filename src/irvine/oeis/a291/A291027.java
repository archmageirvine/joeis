package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291027.
 * @author Sean A. Irvine
 */
public class A291027 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291027() {
    super(new long[] {-1, 9, -17, 9}, new long[] {5, 34, 226, 1501});
  }
}
