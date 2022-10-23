package irvine.oeis.a172;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A172340 a(n)=((2^n+1)^n-(2^n-1)^n)/2.
 * @author Georg Fischer
 */
public class A172340 extends Sequence1 {

  protected int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return Z.ONE.shiftLeft(mN).add(1).pow(mN).subtract(Z.ONE.shiftLeft(mN).subtract(1).pow(mN)).divide2();
  }
}
