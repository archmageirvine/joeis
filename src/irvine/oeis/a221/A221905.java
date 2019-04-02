package irvine.oeis.a221;

import irvine.oeis.LinearRecurrence;

/**
 * A221905 3^n + 3*n.
 * @author Sean A. Irvine
 */
public class A221905 extends LinearRecurrence {

  /** Construct the sequence. */
  public A221905() {
    super(new long[] {3, -7, 5}, new long[] {1, 6, 15});
  }
}
