package irvine.oeis.a050;

import irvine.math.z.Z;

/**
 * A050611 Sum_{i=0..n} (C(n,i) mod 2)*Fibonacci(2i+1) = FL(n+1)Product(L(2^i)^bit(n,i),i=0..).
 * @author Sean A. Irvine
 */
public class A050611 extends A050609 {

  private int mN = -1;

  @Override
  public Z next() {
    return t(++mN, 1);
  }
}
