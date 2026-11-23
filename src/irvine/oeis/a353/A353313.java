package irvine.oeis.a353;

import irvine.math.z.Z;
import irvine.oeis.LambdaSequence;

/**
 * A353313 If n is of the form 3k, then a(n) = k, and if n is of the form 3k+r, with r = 1 or 2, then a(n) = 5*k + 3 + r.
 * @author Gregory Morse
 */
public class A353313 extends LambdaSequence {

  /** Construct the sequence. */
  public A353313() {
    super(0, n -> step(Z.valueOf(n)));
  }

  static Z step(final Z n) {
    return n.mod(3) == 0 ? n.divide(3) : A353314.step(n);
  }
}
