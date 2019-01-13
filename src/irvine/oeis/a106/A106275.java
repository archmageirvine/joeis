package irvine.oeis.a106;

import irvine.math.z.Z;

/**
 * A106275.
 * @author Sean A. Irvine
 */
public class A106275 extends A106273 {

  @Override
  public Z next() {
    while (!super.next().abs().makeOdd().isProbablePrime(10)) {
    }
    return Z.valueOf(mN);
  }
}

