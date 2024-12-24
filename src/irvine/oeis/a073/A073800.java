package irvine.oeis.a073;

import irvine.math.z.Z;
import irvine.oeis.a002.A002808;

/**
 * A073800 Remainder of division 2^n/c(n), where c(n)=A002808(n), the n-th composite.
 * @author Sean A. Irvine
 */
public class A073800 extends A002808 {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.TWO.modPow(++mN, super.next());
  }
}
