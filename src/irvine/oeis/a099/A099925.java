package irvine.oeis.a099;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A099925 a(n) = Lucas(n) + (-1)^n.
 * @author Sean A. Irvine
 */
public class A099925 extends LinearRecurrence {

  /** Construct the sequence. */
  public A099925() {
    super(new long[] {1, 2, 0}, new long[] {3, 0, 4});
  }
}
