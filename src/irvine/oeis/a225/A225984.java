package irvine.oeis.a225;

import irvine.oeis.LinearRecurrence;

/**
 * A225984.
 * @author Sean A. Irvine
 */
public class A225984 extends LinearRecurrence {

  /** Construct the sequence. */
  public A225984() {
    super(new long[] {1, 0, -1, 1, -1}, new long[] {5, -1, 3, -7, 11});
  }
}
