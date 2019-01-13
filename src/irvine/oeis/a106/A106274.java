package irvine.oeis.a106;

import irvine.math.z.Z;

/**
 * A106274.
 * @author Sean A. Irvine
 */
public class A106274 extends A106273 {

  @Override
  public Z next() {
    while (!super.next().abs().isProbablePrime(10)) {
    }
    return Z.valueOf(mN);
  }
}

