package irvine.oeis.a024;

import irvine.oeis.LinearRecurrence;

/**
 * A024102 <code>9^n-n</code>.
 * @author Sean A. Irvine
 */
public class A024102 extends LinearRecurrence {

  /** Construct the sequence. */
  public A024102() {
    super(new long[] {9, -19, 11}, new long[] {1, 8, 79});
  }
}
