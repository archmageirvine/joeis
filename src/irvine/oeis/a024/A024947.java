package irvine.oeis.a024;

import irvine.math.z.Z;

/**
 * A024947 a(n) = Sum_{i=1..floor((n+2)/4)} a(2i-1)*a(n-2i+1), with a(1)=a(2)=1 and a(3)=3.
 * @author Sean A. Irvine
 */
public class A024947 extends A024945 {

  @Override
  protected Z c() {
    return Z.THREE;
  }
}
