package irvine.oeis.a321;
// Generated by gen_seq4.pl 2023-09-24/mult at 2023-09-24 21:44

import irvine.math.function.Functions;
import irvine.oeis.MultiplicativeSequence;

/**
 * A321898 Sum of coefficients of power sums symmetric functions in h(y) * Product_i y_i! where h is homogeneous symmetric functions and y is the integer partition with Heinz number n.
 * @author Georg Fischer
 */
public class A321898 extends MultiplicativeSequence {

  /** Construct the sequence. */
  public A321898() {
    super(1, (p, e) -> Functions.FACTORIAL.z(Math.toIntExact(Functions.PRIME_PI.l(p))).pow(e));
  }
}
