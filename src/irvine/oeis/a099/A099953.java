package irvine.oeis.a099;
// manually 2021-05-23

import irvine.oeis.HolonomicRecurrence;

/**
 * A099953 a(n) = A076795(n) - 1.
 * @author Georg Fischer
 */
public class A099953 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A099953() {
    super(1, "[[0],[3,-2],[-2, 2],[-1]]", "0, 1, 4", 0);
  }
}
