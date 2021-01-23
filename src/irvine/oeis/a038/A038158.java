package irvine.oeis.a038;

import irvine.math.z.Z;

/**
 * A038158 a(n) = (n!/2)*Sum(1/k!, k=1..n-2).
 * @author Sean A. Irvine
 */
public class A038158 extends A038157 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}
