package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099262.
 * @author Sean A. Irvine
 */
public class A099262 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099262() {
    super(new long[] {-840, 2038, -1849, 820, -190, 22}, new long[] {1, 2, 5, 15, 52, 203});
  }
}
