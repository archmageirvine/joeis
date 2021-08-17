package irvine.oeis.a050;

import irvine.math.z.Z;

/**
 * A050612 Sum_{i=0..n} (C(n,i) mod 2)*Fibonacci(2i+3) = FL(n+3)Product(L(2^i)^bit(n,i),i=0..).
 * @author Sean A. Irvine
 */
public class A050612 extends A050609 {

  private int mN = -1;

  @Override
  public Z next() {
    return t(++mN, 3);
  }
}
