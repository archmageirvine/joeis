package irvine.oeis.a106;

import irvine.oeis.LinearRecurrence;

/**
 * A106250.
 * @author Sean A. Irvine
 */
public class A106250 extends LinearRecurrence {

  /** Construct the sequence. */
  public A106250() {
    super(new long[] {-1, 1, 0, 0, 0, 1}, new long[] {1, 0, 1, 2, 2, 3});
  }
}
