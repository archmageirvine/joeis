package irvine.oeis.a018;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A018227 Magic numbers: atoms with full shells containing any of these numbers of electrons are considered electronically stable.
 * @author Sean A. Irvine
 */
public class A018227 extends LinearRecurrence {

  /** Construct the sequence. */
  public A018227() {
    super(1, new long[] {-1, 2, 1, -4, 1, 2}, new long[] {2, 10, 18, 36, 54, 86});
  }
}
