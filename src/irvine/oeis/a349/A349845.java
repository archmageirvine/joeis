package irvine.oeis.a349;
// Generated by gen_seq4.pl hologfm/hologf at 2022-12-01 18:58

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A349845 Expansion of -(1 - 16*x)^(1/2) / (1 + 8*x)^(1/4).
 * @author Georg Fischer
 */
public class A349845 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A349845() {
    // o.g.f. -(1-16*x)^(1/2)/(1+8*x)^(1/4)
    // recurrence (8*n-18)*u(n-1)+(128*n-288)*u(n-2)-n*u(n) = 0
    super(0, "[[0],[-288, 128],[-18, 8],[0,-1]]", "[-1, 10, 6]", 0);
  }
}
