package irvine.oeis.a035;

import irvine.math.z.Z;
import irvine.oeis.a000.A000521;

/**
 * A035230 Fourier coefficients of T_0.
 * @author Sean A. Irvine
 */
public class A035230 extends A000521 {

  @Override
  public Z next() {
    return super.next().multiply(-mN);
  }
}

