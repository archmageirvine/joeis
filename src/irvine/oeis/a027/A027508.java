package irvine.oeis.a027;

import irvine.math.z.Z;

/**
 * A027508 Second column of A027495.
 * @author Sean A. Irvine
 */
public class A027508 extends A027495 {

  /** Construct the sequence. */
  public A027508() {
    super(2);
  }

  private int mN = 0;

  {
    step();
  }

  @Override
  public Z next() {
    step();
    return mMatrix.get(++mN, 1).multiply(mLcm).toZ();
  }
}
