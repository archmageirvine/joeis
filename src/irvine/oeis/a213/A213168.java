package irvine.oeis.a213;
// manually holom 2021-08-25

import irvine.oeis.HolonomicRecurrence;

/**
 * A213168 a(n) = n!/2 - (n-1)! - n + 2.
 * @author Georg Fischer
 */
public class A213168 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A213168() {
    super(2, "[[24,-32, 14,-2],[-4, 6,-2],[-6, 2]]", "[0, 0]", 0);
  }
}
