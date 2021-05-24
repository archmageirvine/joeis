package irvine.oeis.a047;

import irvine.math.z.Z;

/**
 * A047877 a(n) = (1/2)*Sum_{i=0..n} T(i,n-i), array T as in A049604.
 * @author Sean A. Irvine
 */
public class A047877 extends A047876 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}
