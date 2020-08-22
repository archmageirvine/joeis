package irvine.oeis.a026;

import irvine.math.z.Z;
import irvine.oeis.a002.A002212;

/**
 * A026376 a(n) is the number of integer strings s(0),...,s(n) counted by array T in A026374 that have s(n)=2; also a(n) = T(2n,n-1).
 * @author Sean A. Irvine
 */
public class A026376 extends A002212 {

  private long mN = 0;
  {
    super.next();
  }

  @Override
  public Z next() {
    return super.next().multiply(++mN);
  }
}
