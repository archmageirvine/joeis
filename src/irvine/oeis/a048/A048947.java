package irvine.oeis.a048;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a046.A046528;

/**
 * A048947 Let b(n) be the terms of A046528. Then sigma(b(n))=2^(a(n)), where sigma=A000203 is the sum of divisors function.
 * @author Sean A. Irvine
 */
public class A048947 extends A046528 {

  @Override
  public Z next() {
    return Z.valueOf(Jaguar.factor(super.next()).sigma().bitLength() - 1);
  }
}

