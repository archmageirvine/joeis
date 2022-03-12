package irvine.oeis.a104;

import irvine.oeis.a001.A001497;
import irvine.oeis.triangle.Inverse;

/**
 * A104556 Matrix inverse of triangle A001497 of Bessel polynomials, read by rows; essentially the same as triangle A096713 of modified Hermite polynomials.
 * @author Georg Fischer
 */
public class A104556 extends Inverse {

  /** Construct the sequence. */
  public A104556() {
    super(new A001497());
  }
}
