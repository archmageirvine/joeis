package irvine.oeis.a035;

import irvine.oeis.LinearRecurrence;

/**
 * A035606 Number of points of L1 norm 12 in cubic lattice Z^n.
 * @author Sean A. Irvine
 */
public class A035606 extends LinearRecurrence {

  /** Construct the sequence. */
  public A035606() {
    super(new long[] {1, -13, 78, -286, 715, -1287, 1716, -1716, 1287, -715, 286, -78, 13}, new long[] {0, 2, 48, 578, 4672, 28610, 142000, 596610, 2187520, 7159170, 21278640, 58227906, 148321344});
  }
}
