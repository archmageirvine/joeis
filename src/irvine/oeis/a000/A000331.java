package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a158.A158616;

/**
 * A000331 Related to zeros of Bessel function.
 * @author Sean A. Irvine
 */
public class A000331 implements Sequence {

  private int mN = 3;

  @Override
  public Z next() {
    return A158616.phi2n(++mN, 1).coeff(1).toZ();
  }
}

