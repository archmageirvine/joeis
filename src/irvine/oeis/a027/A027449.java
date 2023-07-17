package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027449 Second diagonal of A027446.
 * @author Sean A. Irvine
 */
public class A027449 extends A027446 {

  /** Construct the sequence. */
  public A027449() {
    super(2);
  }

  private long mN = 0;

  {
    step();
  }

  @Override
  public Z next() {
    step();
    return mMatrix.get(++mN, mN - 1).multiply(mLcm).toZ();
  }
}
