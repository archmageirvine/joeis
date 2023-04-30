package irvine.oeis.a108;
// manually verified, holos, 2023-04-29

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A108716 a(n) = tan(Pi/14)^(-2n) + tan(3*Pi/14)^(-2n) + tan(5*Pi/14)^(-2n).
 * @author Georg Fischer
 */
public class A108716 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A108716() {
    super(0, "[[0],[-7],[35],[-21],[1]]", "3,21,371", 0);
  }
}
