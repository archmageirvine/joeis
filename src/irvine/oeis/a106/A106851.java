package irvine.oeis.a106;

import irvine.oeis.LinearRecurrence;

/**
 * A106851.
 * @author Sean A. Irvine
 */
public class A106851 extends LinearRecurrence {

  /** Construct the sequence. */
  public A106851() {
    super(new long[] {1, 0, -16, 8}, new long[] {0, 2, 9, 37});
  }
}
