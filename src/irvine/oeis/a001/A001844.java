package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A001844 Centered square numbers: a(n) = 2*n*(n+1)+1. Sums of two consecutive squares. Also, consider all Pythagorean triples (X, Y, Z=Y+1) ordered by increasing Z; then sequence gives Z values.
 * @author Sean A. Irvine
 */
public class A001844 extends Sequence0 {

  private long mN = -4;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    mN += 4;
    mA = mA.add(mN);
    return mA;
  }
}
