package irvine.oeis.a059;

import irvine.math.z.Z;

/**
 * A059917 a(n) = (3^(2^n) + 1)/2 = A059919(n)/2, n &gt;= 0.
 * @author Georg Fischer
 */
public class A059917 extends A059919 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}
