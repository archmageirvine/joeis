package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099448.
 * @author Sean A. Irvine
 */
public class A099448 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099448() {
    super(new long[] {-1, 5, -7, 5}, new long[] {1, 5, 19, 65});
  }
}
