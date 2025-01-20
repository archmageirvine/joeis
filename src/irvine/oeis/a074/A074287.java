package irvine.oeis.a074;

import irvine.oeis.FilterPositionSequence;
import irvine.oeis.a054.A054353;

/**
 * A074287 Even numbers n such that the partial sum of the Kolakoski sequence (A000002) at n is less than 3n/2.
 * @author Sean A. Irvine
 */
public class A074287 extends FilterPositionSequence {

  /** Construct the sequence. */
  public A074287() {
    super(1, 1, new A054353(), (n, k) -> (n & 1) == 0 && k.multiply2().compareTo(3L * n) < 0);
  }
}
