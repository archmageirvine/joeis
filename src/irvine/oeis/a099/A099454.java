package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099454.
 * @author Sean A. Irvine
 */
public class A099454 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099454() {
    super(new long[] {-1, 7, -13, 7}, new long[] {1, 7, 37, 175});
  }
}
