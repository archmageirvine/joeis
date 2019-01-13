package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099839.
 * @author Sean A. Irvine
 */
public class A099839 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099839() {
    super(new long[] {-5, -10}, new long[] {1, -11});
  }
}
