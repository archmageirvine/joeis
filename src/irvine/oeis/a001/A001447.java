package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A001447 a(n) = (5^n + 5^floor(n/2))/2.
 * @author Sean A. Irvine
 */
public class A001447 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    return Z.FIVE.pow(mN).add(Z.FIVE.pow(mN / 2)).divide2();
  }
}
