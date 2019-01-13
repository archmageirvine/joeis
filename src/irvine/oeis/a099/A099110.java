package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099110.
 * @author Sean A. Irvine
 */
public class A099110 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099110() {
    super(new long[] {24, -2, -17, 8}, new long[] {1, 8, 47, 238});
  }
}
