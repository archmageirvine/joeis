package irvine.oeis.a011;

import irvine.math.z.Z;
import irvine.oeis.a002.A002322;

/**
 * A011773 Variant of Carmichael's lambda function: a(p1^e1*...*pN^eN) = lcm((p1-1)*p1^(e1-1), <code>..</code>., (pN-1)*pN^(eN-1)).
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
