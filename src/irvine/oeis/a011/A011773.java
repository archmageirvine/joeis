package irvine.oeis.a011;

import irvine.math.z.Z;
import irvine.oeis.a002.A002322;

/**
 * A011773.
 * @author Sean A. Irvine
 */
public class A011773 extends A002322 {

  private long mN = 0;

  @Override
  public Z next() {
    mN += 2;
    return mN == 4 ? Z.ONE : lambda(mN);
  }
}
