package irvine.oeis.a099;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A099923 Fourth powers of Lucas numbers A000032.
 * @author Sean A. Irvine
 */
public class A099923 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099923() {
    super(new long[] {1, -5, -15, 15, 5}, new long[] {16, 1, 81, 256, 2401});
  }
}
