package irvine.oeis.a349;
// manually linrec/linrec2 at 2022-04-29 07:28

import irvine.oeis.recur.HolonomicRecurrence;

/**
 * A349201 a(n) = [x^n] ((x^2*(1 + 3*x + x^2 - 2*x^3 + 3*x^4 + x^5 - x^6))/((-1 + x)^4 *(1 + x)^3)).
 * @author Georg Fischer
 */
public class A349201 extends HolonomicRecurrence {

  /** Construct the sequence. */
  public A349201() {
    super(1, "[[0],[-1],[1],[3],[-3],[-3],[3],[1],[-1]]", "0, 1, 4, 8, 15, 27, 40, 64", 0);
  }
}
