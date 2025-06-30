package irvine.oeis.a077;

import irvine.math.z.Z;

/**
 * A077171 a(n) = k where k! is the product of the terms of the n-th row of A077168.
 * @author Sean A. Irvine
 */
public class A077171 extends A077168 {

  {
    setOffset(0);
  }

  @Override
  public Z next() {
    step();
    return Z.valueOf(mFactorialIndex);
  }
}

