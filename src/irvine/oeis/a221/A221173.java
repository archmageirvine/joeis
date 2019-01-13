package irvine.oeis.a221;

import irvine.oeis.LinearRecurrence;

/**
 * A221173.
 * @author Sean A. Irvine
 */
public class A221173 extends LinearRecurrence {

  /** Construct the sequence. */
  public A221173() {
    super(new long[] {1, 2}, new long[] {-3, 4});
  }
}
