package irvine.oeis.a382;

import irvine.math.z.Z;

/**
 * A382783 Denominators arising in the expansion of Sum_{k&gt;=1} (1/(4k^2-1)^n) in even powers of Pi.
 * @author Sean A. Irvine
 */
public class A382783 extends A382782 {

  @Override
  public Z next() {
    step();
    return mLcm;
  }
}
