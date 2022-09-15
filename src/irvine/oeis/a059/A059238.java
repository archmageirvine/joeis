package irvine.oeis.a059;

import irvine.math.z.Z;
import irvine.oeis.a246.A246655;

/**
 * A059238.
 * @author Sean A. Irvine
 */
public class A059238 extends A246655 {

  @Override
  public Z next() {
    final Z pk = super.next();
    return pk.add(1).multiply(pk).multiply(pk.subtract(1).square());
  }
}

