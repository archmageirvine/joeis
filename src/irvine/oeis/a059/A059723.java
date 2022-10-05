package irvine.oeis.a059;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A059723 Mean of the first 2^n nonnegative powers of 3, i.e., (1 + 3 + 3^2 + ... + 3^(2^n-1))/2^n.
 * @author Sean A. Irvine
 */
public class A059723 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    return Z.THREE.pow(1L << ++mN).subtract(1).shiftRight(mN + 1);
  }
}

