package irvine.oeis.a221;

import irvine.oeis.LinearRecurrence;

/**
 * A221762.
 * @author Sean A. Irvine
 */
public class A221762 extends LinearRecurrence {

  /** Construct the sequence. */
  public A221762() {
    super(new long[] {-1, 0, 20, 0}, new long[] {1, 2, 22, 41});
  }
}
