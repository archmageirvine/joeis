package irvine.oeis.a221;

import irvine.oeis.LinearRecurrence;

/**
 * A221875.
 * @author Sean A. Irvine
 */
public class A221875 extends LinearRecurrence {

  /** Construct the sequence. */
  public A221875() {
    super(new long[] {-1, 0, 38, 0}, new long[] {1, 7, 31, 265});
  }
}
