package irvine.oeis.a081;

import irvine.oeis.LinearRecurrence;

/**
 * A081914.
 * @author Sean A. Irvine
 */
public class A081914 extends LinearRecurrence {

  /** Construct the sequence. */
  public A081914() {
    super(new long[] {-81, 108, -54, 12}, new long[] {1, 3, 9, 28});
  }
}
