package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099624.
 * @author Sean A. Irvine
 */
public class A099624 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099624() {
    super(new long[] {36, 3, -23, 9}, new long[] {0, 0, 1, 9});
  }
}
