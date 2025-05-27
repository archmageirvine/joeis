package irvine.oeis.a038;

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A038521 Number of elements of GF(2^n) with trace 1 and subtrace 1.
 * @author Georg Fischer
 */
public class A038521 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A038521() {
    super(0, "[0,-4,-2,0,1]", "[0,0,2,1]", 0);
  }
}
