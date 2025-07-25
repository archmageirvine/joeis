package irvine.oeis.a299;
// Generated by gen_seq4.pl 2025-07-26.ack/enumof2 at 2025-07-26 21:09

import irvine.math.z.Z;
import irvine.oeis.TwoParameterFormSequence;

/**
 * A299505 Numbers of the form x^4 + y*x^3 + y^2*x^2 + y^3*x + y^4, where x and y are positive integers.
 * @author Georg Fischer
 */
public class A299505 extends TwoParameterFormSequence {

  /** Construct the sequence. */
  public A299505() {
    super(1, 1, 1, (x, y) -> Z.valueOf(x).pow(4).add(Z.valueOf(y).multiply(Z.valueOf(x).pow(3))).add(Z.valueOf(y * x).square()).add(Z.valueOf(y).pow(3).multiply(x)).add(Z.valueOf(y).pow(4)));
  }
}
