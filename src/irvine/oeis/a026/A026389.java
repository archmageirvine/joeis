package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026389 a(n) = number of integer strings s(0),...,s(n) counted by array T in A026386 that have s(n)=4; also a(n) = T(2n,n-2).
 * @author Sean A. Irvine
 */
public class A026389 extends A026386 {

  /** Construct the sequence. */
  public A026389() {
    super(2);
  }

  private long mN = 1;

  @Override
  public Z next() {
    return get(2 * ++mN, mN - 2);
  }
}
