package irvine.oeis.a346;
// manually holos at 2021-12-09

import irvine.oeis.HolonomicRecurrence;
/**
 * A346317 Number of permutations of [n] having two cycles of the form (c1, c2, ..., c_m) where c1 = min_{i&gt;=1} c_i and c_j = min_{i&gt;=j} c_i or c_j = max_{i&gt;=j} c_i.
 * radtorec((4*x^3-7*x^2+5*x-1)*x^2/(4*x-1)/(-1+2*x)^2)
 * @author Georg Fischer
 */
public class A346317 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A346317() {
    super(2, "[[0],[16],[-20],[8],[-1]]", "[1, 3, 11, 40]", 0);
  }
}
