package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099764.
 * @author Sean A. Irvine
 */
public class A099764 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099764() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {0, 36, 576, 3600, 14400, 44100, 112896});
  }
}
