package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007988.
 * @author Sean A. Irvine
 */
public class A007988 implements Sequence {

  private static final Z Z27 = Z.valueOf(27);
  private int mN = 1;

  @Override
  public Z next() {
    ++mN;
    return Z.TWO.multiply(mN).add(16).multiply(mN).add(41).signedAdd((mN & 1) == 0, Z27).multiply(mN + 1).divide(144);
  }
}

