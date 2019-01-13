package irvine.oeis.a221;

import irvine.oeis.LinearRecurrence;

/**
 * A221175.
 * @author Sean A. Irvine
 */
public class A221175 extends LinearRecurrence {

  /** Construct the sequence. */
  public A221175() {
    super(new long[] {1, 2}, new long[] {-5, 6});
  }
}
