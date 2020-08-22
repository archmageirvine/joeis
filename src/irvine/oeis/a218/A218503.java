package irvine.oeis.a218;

import irvine.oeis.LinearRecurrence;

/**
 * A218503 q-factorial numbers 5!_q.
 * @author Sean A. Irvine
 */
public class A218503 extends LinearRecurrence {

  /** Construct the sequence. */
  public A218503() {
    super(new long[] {1, -11, 55, -165, 330, -462, 462, -330, 165, -55, 11}, new long[] {1, 120, 9765, 251680, 3043425, 22661496, 121226245, 510902400, 1799118945, 5507702200L, 15072415941L});
  }
}
