package irvine.oeis.a038;

import irvine.math.z.Z;

/**
 * A038054 Number of labeled trees with 2-colored leaves.
 * @author Sean A. Irvine
 */
public class A038054 extends A038049 {

  /** Construct the sequence. */
  public A038054() {
    super(0);
  }

  private boolean mFirst = true;
  private Z mA = Z.ZERO;

  @Override
  public Z next() {
    if (mFirst) {
      mFirst = false;
      return Z.ONE;
    }
    final Z t = mA;
    mA = super.next();
    return t.multiply(mN).add(mA).divide(mN);
  }
}
