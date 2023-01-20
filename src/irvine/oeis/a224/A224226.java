package irvine.oeis.a224;

import irvine.math.z.Z;
import irvine.oeis.a321.A321527;

/**
 * A224226 a(0)=1; thereafter a(n) =s(n,3)-s(n,4)-s(n,6)+s(n,12), where s(n,k) = sigma(n/k) if k divides n, otherwise 0.
 * @author Georg Fischer
 */
public class A224226 extends A321527 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    final Z result = super.next();
    return (mN == 0) ? Z.ONE : result;
  }
}
