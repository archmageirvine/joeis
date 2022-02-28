package irvine.oeis.a056;
// manually 2022-02-26

import irvine.oeis.HolonomicRecurrence;

/**
 * A056103 Numbers k such that k^6 == 1 (mod 7^5).
 * @author Georg Fischer
 */
public class A056103 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A056103() {
    super(1, "[[0],[-1],[1],[0],[0],[0],[0],[1],[-1]]", "[1, 1353, 1354, 15453, 15454, 16806, 16808]", 0);
  }
}
