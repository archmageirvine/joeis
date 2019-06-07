package irvine.oeis.a140;

import irvine.oeis.LinearRecurrence;

/**
 * A140426 Number of multi-symmetric Steinhaus matrices of size <code>n</code>.
 * @author Sean A. Irvine
 */
public class A140426 extends LinearRecurrence {

  /** Construct the sequence. */
  public A140426() {
    super(new long[] {2, 0, 0, 0, 0, 0}, new long[] {1, 1, 2, 1, 2, 2});
  }
}
