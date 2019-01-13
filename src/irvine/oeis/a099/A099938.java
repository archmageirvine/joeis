package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099938.
 * @author Sean A. Irvine
 */
public class A099938 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099938() {
    super(new long[] {1, -7, 7}, new long[] {2, 4, 18});
  }
}
