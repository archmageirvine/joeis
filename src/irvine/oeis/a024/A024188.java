package irvine.oeis.a024;

import irvine.math.z.Z;

/**
 * A024188 a(n) = ((n+2)!/2)(1/3 - 1/4 + ... + c/(n+2)), where c = (-1)^(n+1).
 * @author Sean A. Irvine
 */
public class A024188 extends A024176 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}
