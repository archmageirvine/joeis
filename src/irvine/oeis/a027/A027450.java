package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027450 Third diagonal of A027446.
 * @author Sean A. Irvine
 */
public class A027450 extends A027446 {

  /** Construct the sequence. */
  public A027450() {
    super(3);
  }

  private long mN = 1;

  {
    step();
    step();
  }

  @Override
  public Z next() {
    step();
    return mMatrix.get(++mN, mN - 2).multiply(mLcm).toZ();
  }
}
