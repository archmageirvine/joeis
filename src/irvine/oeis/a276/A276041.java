package irvine.oeis.a276;

import irvine.oeis.LinearRecurrence;

/**
 * A276041.
 * @author Sean A. Irvine
 */
public class A276041 extends LinearRecurrence {

  /** Construct the sequence. */
  public A276041() {
    super(new long[] {8, -12, 6}, new long[] {1, 6, 28});
  }
}
