package irvine.oeis.a349;
// Generated by gen_seq4.pl satishol/holos at 2023-01-10 22:13

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A349531 G.f. A(x) satisfies: A(x) = 1 + x * A(x)^3 / (1 - 3 * x).
 * @author Georg Fischer
 */
public class A349531 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A349531() {
    super(0, "[[0],[2106,-1755,351],[-576,828,-270],[18,-75,63],[0,-2,-4]]", "[1,1,6]", 0);
  }
}
