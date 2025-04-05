package irvine.oeis.a382;

import irvine.math.z.Z;

/**
 * A382782.
 * @author Sean A. Irvine
 */
public class A382783 extends A382782 {

  @Override
  public Z next() {
    step();
    return mLcm;
  }
}
