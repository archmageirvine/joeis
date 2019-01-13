package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099041.
 * @author Sean A. Irvine
 */
public class A099041 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099041() {
    super(new long[] {2, -5, 4}, new long[] {1, 8, 24});
  }
}
