package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099163.
 * @author Sean A. Irvine
 */
public class A099163 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099163() {
    super(new long[] {-2, 3, 1}, new long[] {1, 1, 2});
  }
}
