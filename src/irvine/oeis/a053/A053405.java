package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A053405 Definition: A kara B = C, where C is the least nonnegative integer such that C * B &gt;= A and C * (B-1) &lt; A. a(n) is the smallest k such that n kara k is undefined.
 * @author Sean A. Irvine
 */
public class A053405 implements Sequence {

  private Z mN = Z.THREE;

  @Override
  public Z next() {
    mN = mN.add(1);
    Z t = Z.THREE;
    while (A053087.kara(mN, t) != null) {
      t = t.add(1);
    }
    return t;
  }
}
