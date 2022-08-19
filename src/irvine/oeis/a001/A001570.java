package irvine.oeis.a001;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A001570 Numbers k such that k^2 is centered hexagonal.
 * @author Georg Fischer
 */
public class A001570 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A001570() {
    super(1, "[0, 1,-14, 1]", "[1, 13]", 0);
  }
}
