package irvine.oeis.a098;

import irvine.math.z.Z;

/**
 * A098391 a(n) = Log2(Log2(prime(n))), where Log2 = A000523.
 * @author Georg Fischer
 */
public class A098391 extends A098388 {

  @Override
  public Z next() {
    return Z.valueOf(super.next().bitLength() - 1);
  }
}
