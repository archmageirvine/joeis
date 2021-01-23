package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027459 Numerator of Sum_{k=1..n} H(k)/k, where H(k) is k-th harmonic number.
 * @author Sean A. Irvine
 */
public class A027459 extends A027447 {

  private long mN = -1;

  @Override
  public Z next() {
    step();
    return mMatrix.get(++mN, 0).num();
  }
}
