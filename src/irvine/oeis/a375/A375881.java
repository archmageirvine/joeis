package irvine.oeis.a375;
// Generated by gen_seq4.pl 2024-10-02.ack/holos at 2024-10-02 22:45

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A375881 a(n) = 2^(3n+1)*cos(nB), where B is the angle opposite side CA in a triangle ABC having sidelengths |BC|=2, |CA| = 3, |AB| = 4; ABC is the smallest integer-sided scalene triangle.
 * @author Georg Fischer
 */
public class A375881 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A375881() {
    super(0, "[0, -64, 11, -1]", "2, 11", 0, 0);
  }
}
