package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.a002.A002110;

/**
 * A006939 Chernoff sequence: a(n) = Product_{k=1..n} prime(k)^(n-k+1).
 * @author Sean A. Irvine
 */
public class A006939 extends A002110 {

  private Z mA = Z.ONE;

  @Override
  public Z next() {
    mA = mA.multiply(super.next());
    return mA;
  }
}
