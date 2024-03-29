package irvine.oeis.a199;
// Generated by gen_seq4.pl holos at 2024-02-09 22:47

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A199475 G.f. satisfies A(x) = Sum_{n&gt;=0} x^n * (1 - A(x)^(2*n+2))/(1 - A(x)^2).
 * G.f.A(x) satisfies -A+1/(1-x)/(-A^2*x+1)=0
 * @author Georg Fischer
 */
public class A199475 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A199475() {
    super(0, "[[0], [72, -34, 4], [-498, 279, -39], [426, -257, 35], [-42, -23, 35], [-6, 33, -39], [0, 2, 4]]", "1, 2, 7, 34, 195, 1225, 8146", 0, 0);
  }
}
