package irvine.oeis.a052;
// manually 2021-11-05

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A052725 A simple context-free grammar in a labeled universe.
 * @author Georg Fischer
 */
public class A052725 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A052725() {
    super(0, "[[0]],[-4608, 2304, 85248,-32256,-184320,-73728],[-92736,-289440,-241344,-41472, 9216],[79800, 56512,-59520,-34048],[-61988,-46176,-7456],[-572, 2228],[217]]", "0, 0, 0, 0, 24, 480, 10080", 5);
  }
}
