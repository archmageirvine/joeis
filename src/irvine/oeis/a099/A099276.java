package irvine.oeis.a099;

import irvine.oeis.LinearRecurrence;

/**
 * A099276.
 * @author Sean A. Irvine
 */
public class A099276 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099276() {
    super(new long[] {-1, 19, 19}, new long[] {0, 1, 18});
  }
}
