package irvine.oeis.a084;

import irvine.math.z.Z;
import irvine.oeis.TwoParameterFormSequence;

/**
 * A084916 Positive numbers of the form k = x^2 - 3*y^2.
 * @author Sean A. Irvine
 */
public class A084916 extends TwoParameterFormSequence {

  /** Construct the sequence. */
  public A084916() {
    super(1, 0, 1, (x, y) -> x > y ? null : Z.valueOf(x).square().add(Z.FOUR.multiply(x).multiply(y)).add(Z.valueOf(y).square()));
  }
}

