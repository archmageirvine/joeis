package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099110 Expansion of 1 / ((1+x)*(1-2x)*(1-3x)*(1-4x)).
 * @author Sean A. Irvine
 */
public class A099110 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099110() {
    super(new long[] {24, -2, -17, 8}, new long[] {1, 8, 47, 238});
  }
}
