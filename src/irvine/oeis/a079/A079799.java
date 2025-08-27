package irvine.oeis.a079;

import irvine.math.z.Z;

/**
 * A079799 Ratios of successive terms in A079798.
 * @author Sean A. Irvine
 */
public class A079799 extends A079798 {

  private Z mA = super.next();

  @Override
  public Z next() {
    final Z t = mA;
    mA = super.next();
    return mA.divide(t);
  }
}

