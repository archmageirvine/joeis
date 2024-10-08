package irvine.oeis.a375;
// Generated by gen_seq4.pl 2024-10-02.ack/holos at 2024-10-02 22:45

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A375884 a(n) = 2^(2n-1) sin(nB)/(3 sqrt(15)), where B is the angle opposite side CA in a triangle ABC having sidelengths |BC|=2, |CA| = 3, |AB| = 4; ABC is the smallest integer-sided scalene triangle.
 * @author Georg Fischer
 */
public class A375884 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A375884() {
    super(0, "[0, -64, 11, -1]", "0, 1", 0, 0);
  }
}
