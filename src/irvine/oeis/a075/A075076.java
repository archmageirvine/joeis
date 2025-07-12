package irvine.oeis.a075;

import irvine.math.z.Z;

/**
 * A075076 Integers pertaining to A075075: a(n) = b(n-1)*b(n+1)/b(n) where b(n) is the n-th term of A075075.
 * @author Sean A. Irvine
 */
public class A075076 extends A075075 {

  private Z mA = super.next();
  private Z mB = super.next();

  {
    setOffset(2);
  }

  @Override
  public Z next() {
    final Z t = mA;
    mA = mB;
    mB = super.next();
    return t.multiply(mB).divide(mA);
  }
}

