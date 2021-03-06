package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026387 a(n) = number of integer strings s(0),...,s(n) counted by array T in A026386 that have s(n)=0; also a(n) = T(2n,n).
 * @author Sean A. Irvine
 */
public class A026387 extends A026386 {

  private long mN = 0;

  @Override
  public Z next() {
    return get(2 * ++mN, mN);
  }
}
