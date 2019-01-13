package irvine.oeis.a106;

import irvine.oeis.LinearRecurrence;

/**
 * A106388.
 * @author Sean A. Irvine
 */
public class A106388 extends LinearRecurrence {

  /** Construct the sequence. */
  public A106388() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {11, 23, 131, 167, 383});
  }
}
