package irvine.oeis.a026;

import irvine.math.z.Z;

/**
 * A026388 a(n) is the number of integer strings s(0),...,s(n) counted by array T in A026386 that have s(n)=2; also a(n) = T(2n,n-1).
 * @author Sean A. Irvine
 */
public class A026388 extends A026386 {

  /** Construct the sequence. */
  public A026388() {
    super(1);
  }

  private long mN = 0;

  @Override
  public Z next() {
    return get(2 * ++mN, mN - 1);
  }
}
