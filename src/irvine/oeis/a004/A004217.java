package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A004217 a(n) = (n^n)^(n^n).
 * @author Sean A. Irvine
 */
public class A004217 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    final Z n2 = Z.valueOf(mN).pow(mN);
    return n2.pow(n2);
  }
}
