package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099234 A trisection of 1/(1-x-x^4).
 * @author Sean A. Irvine
 */
public class A099234 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099234() {
    super(new long[] {1, 3, 3, 1}, new long[] {1, 1, 4, 10});
  }
}
