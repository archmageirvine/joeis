package irvine.oeis.a100;

import irvine.math.z.BellNumbers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A100728 Number of rank-(n-2) simple matroids on S_n.
 * @author Sean A. Irvine
 */
public class A100728 implements Sequence {

  private int mN = 3;

  @Override
  public Z next() {
    return BellNumbers.bell(++mN + 1).subtract(Z.valueOf((long) mN * mN + mN + 4).shiftLeft(mN - 2)).add(Z.valueOf(3L * mN * mN - mN + 10).multiply(mN + 1).multiply(mN).divide(24));
  }
}

