package irvine.oeis.a047;

import irvine.math.z.Z;

/**
 * A047761 a(n) = A047760(2n+1).
 * @author Sean A. Irvine
 */
public class A047761 extends A047760 {

  {
    setOffset(0);
  }

  @Override
  public Z next() {
    final Z res = super.next();
    super.next();
    return res;
  }
}

