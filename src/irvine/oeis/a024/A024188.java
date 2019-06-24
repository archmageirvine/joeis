package irvine.oeis.a024;

import irvine.math.z.Z;

/**
 * A024188 <code>((n+2)!/2)(1/3 - 1/4 + ... + c/(n+2))</code>, where c <code>= (-1)^(n+1)</code>.
 * @author Sean A. Irvine
 */
public class A024188 extends A024176 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}
